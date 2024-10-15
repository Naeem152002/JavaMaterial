package com.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {	
  @GetMapping("/hello")
	public ResponseEntity<String> hello(){
    	try {
   		int x=10/0;
				return ResponseEntity.ok("Data insereted");
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("exception occured "+e.getMessage());
		}
    	 
		}
	
}
//ye galat hain ye sabake liye alag -2 bana padega isliye hum hum khuda ka method banayenge