package com.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.dto.StudentDto;
import com.restapi.service.UserService;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	private UserService studentService;
	
	@PostMapping("/register")
	public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto studentDto) {
	    try {
	        StudentDto addedStudentDto = studentService.addStudent(studentDto);
	        return new ResponseEntity<>(addedStudentDto, HttpStatus.CREATED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}


}
