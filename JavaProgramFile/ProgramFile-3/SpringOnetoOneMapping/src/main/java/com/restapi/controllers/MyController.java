package com.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
	public StudentDto registerStudent(@RequestBody StudentDto studentDto) {
        System.out.println(studentDto.getAddressDto());         
		studentDto.getAddressDto();
                   return this.studentService.addStudent(studentDto);
	}

}
