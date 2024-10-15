package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.UserDto;
import com.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	UserService userService;
	
	@PostMapping("/")
	public ResponseEntity<String>createUser(@Valid @RequestBody UserDto userDto){
		UserDto Dto=userService.insertAdmin(userDto);
		if(Dto!=null) {
		return new ResponseEntity<String>("Successfully Registered",HttpStatus.CREATED);
	}else {
		return new ResponseEntity<String>("Email Allready Registered",HttpStatus.OK);
	}}
	}