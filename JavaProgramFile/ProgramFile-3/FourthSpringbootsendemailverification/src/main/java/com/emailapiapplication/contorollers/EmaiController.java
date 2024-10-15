package com.emailapiapplication.contorollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emailapiapplication.model.EmailRequest;
import com.emailapiapplication.service.EmailService;


@RestController
public class EmaiController {
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "hello";
	}
	//api to send email
	@PostMapping("/sendEmail")
	public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request) {

		
		System.out.println(request);
		boolean result=this.emailService.sendEmail(request.getSubject(), request.getMessage(), request.getTo());
		
		if(result) {
			return ResponseEntity.ok("Email is sent Successfully....");	
		}
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email is not sent....");	
		}
	}
	
	
	
}


