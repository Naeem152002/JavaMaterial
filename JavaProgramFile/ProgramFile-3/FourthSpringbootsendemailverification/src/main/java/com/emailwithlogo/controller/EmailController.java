package com.emailwithlogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emailapiapplication.model.EmailRequest;
import com.emailwithlogo.service.EmailService;

@RestController
public class EmailController {
	
	
	@Autowired
	private EmailService emailService;
	@PostMapping("/sendEmail")
	public ResponseEntity<?>sendEmail(@RequestBody EmailRequest request){
		boolean check=emailService.sendEmail(request.getTo(), request.getSubject(), request.getMessage());
		if(check) {
			return ResponseEntity.ok("Email Sent Successfully");
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email does not Sent");
	}
	}


