package com.controller;

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

import com.entities.JwtRequest;
import com.entities.JwtResponse;
import com.security.JwtTokenHelper;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private JwtTokenHelper jwtTokenHelper;
	
	@Autowired
	private AuthenticationManager authenticationManger;
	
	private Logger logger=LoggerFactory.getLogger(AuthController.class);
	
	@PostMapping("/login")
	public ResponseEntity<JwtResponse>login(@RequestBody JwtRequest jwtRequest){
		this.doAuthenticate(jwtRequest.getName(), jwtRequest.getPassword());
		
		UserDetails userDetails=userDetailsService.loadUserByUsername(jwtRequest.getName());
		 String token = this.jwtTokenHelper.generateToken(userDetails);
		
		JwtResponse response=JwtResponse.builder().token(token).name(userDetails.getUsername()).build();
		
		return new ResponseEntity<JwtResponse>(response,HttpStatus.OK);
	}
	public void doAuthenticate(String name,String password) {
		UsernamePasswordAuthenticationToken au=new UsernamePasswordAuthenticationToken(name, password);
		
	try {
		authenticationManger.authenticate(au);
	}catch(BadCredentialsException e) {
		throw new BadCredentialsException("Invalid Username and Password");
	}
	}
	
	

}
