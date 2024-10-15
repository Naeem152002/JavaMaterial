package com.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.service.UserService;

@RestController
@RequestMapping("/api")
public class MyController {
	
	 @Autowired
	    private UserService userService;

	    @PostMapping("/register")
	    public ResponseEntity<String> registerStudentForCourse(@RequestParam int categoryId, @RequestParam int productId) {
	        String message = userService.registerStudentForCourse(categoryId, productId);
	        return ResponseEntity.ok(message);
	    }
	}



