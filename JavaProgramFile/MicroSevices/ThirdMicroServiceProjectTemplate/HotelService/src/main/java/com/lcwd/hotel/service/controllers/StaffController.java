package com.lcwd.hotel.service.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staffs")
public class StaffController {

	@GetMapping
	public ResponseEntity<List<String>>getStaffs(){
		List<String>list=Arrays.asList("Ram","Syam","Radaha","sheel");
		return new ResponseEntity<>(list,HttpStatus.OK);
		
	}
	

}

