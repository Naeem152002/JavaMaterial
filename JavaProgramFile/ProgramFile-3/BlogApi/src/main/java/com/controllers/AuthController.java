package com.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payloads.JwtRequest;
import com.payloads.JwtResponse;
import com.payloads.UserDto;
import com.security.JwtTokenHelper;
import com.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired
	private UserService userService;
	
	
	@Autowired
	AuthenticationManager authenticationManger;
	
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private JwtTokenHelper jwtTokenHelper;
	
	
	private Logger logger=LoggerFactory.getLogger(AuthController.class);
	
	
	@PostMapping("/register")
	public ResponseEntity<?>creatAdmin(@Valid @RequestBody UserDto userDto){
		UserDto dto=userService.insertAdmin(userDto);
		if(dto==null) {
		return	new ResponseEntity<>("Email Already Exist",HttpStatus.CONFLICT);
		}
		else {
		return	ResponseEntity.ok(dto);
	}
	}
		@PostMapping("/login")
		public ResponseEntity<JwtResponse>login(@RequestBody JwtRequest jwtRequest){
			
			this.doAuthenticate(jwtRequest.getEmail(), jwtRequest.getPassword());
			
			UserDetails userDetails=userDetailsService.loadUserByUsername(jwtRequest.getEmail());
			String token=jwtTokenHelper.generateToken(userDetails);
			
			JwtResponse response=JwtResponse.builder().token(token).username(userDetails.getUsername()).build();
			
			return new ResponseEntity<JwtResponse>(response,HttpStatus.CREATED);
		}
	
		public void doAuthenticate(String email,String password) {
			UsernamePasswordAuthenticationToken up=new UsernamePasswordAuthenticationToken(email, password);
			try {
				authenticationManger.authenticate(up);
			
		}catch(BadCredentialsException e) {
			throw new BadCredentialsException("Invalid Username and Password!!");
		}
		
	}

}
