package com.controllers;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.LoginDto;
import com.dto.UserDto;
import com.sendemail.SendEmail;
import com.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	public UserService service;
	
	
	@PostMapping("/register")
	public ResponseEntity<Object> register(@Valid @RequestBody UserDto userDto) {
		Random random=new Random();
		int number = random.nextInt(999999);
		userDto.setOtp(number);
		UserDto user = service.addUser(userDto);
		if(user!=null) {
			SendEmail.sendEmail(user.getEmail(), Integer.toString(number));
			return ResponseEntity.status(HttpStatus.CREATED).body("Successfully Registered");
		}
		else {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already registered");
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> userLogin(@Valid @RequestBody LoginDto userDto) {
		LoginDto user = service.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
		if (user!=null) {
			if(user.getStatus().equals("inactive")) {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Account not verified");
			}
			else
				return ResponseEntity.ok("Logged-in Successfully");
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Details");
		}
	}
	
	@PostMapping("login/{otp}")
	public ResponseEntity<String> login(@Valid @RequestBody LoginDto userDto,@PathVariable int otp) {
		LoginDto user = service.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
		if (user!=null) {
			if(user.getStatus().equals("inactive")) {
			if(otp==user.getOtp()) {
				user.setStatus("active");
				service.update(user);
			return ResponseEntity.ok("Logged-in Successfully");
			}
			else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid OTP");
			}
			}else
				return ResponseEntity.ok("Logged-in Successfully");
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Details");
		}
	}
	
	
	@PutMapping("update/{id}")
	public ResponseEntity<String> update(@Valid @RequestBody UserDto dto,@PathVariable int id) {
		try {
			UserDto userById = service.getUserById(id);
				dto.setId(id);
				dto.setStatus(userById.getStatus());
				dto.setOtp(userById.getOtp());
			service.update(dto);
			 return ResponseEntity.ok("User information updated successfully.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
		}
	}
	
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteJsp(@PathVariable int id ) {
		UserDto user = service.getUserById(id);
	    if (user != null) {
	        service.delete(user);
	        return ResponseEntity.ok("User deleted successfully");
	    } else {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	    }
	}
	
	@GetMapping("/users")
	public ResponseEntity<Object> getUsers(){
		return ResponseEntity.ok(service.findAll());
	}
}
