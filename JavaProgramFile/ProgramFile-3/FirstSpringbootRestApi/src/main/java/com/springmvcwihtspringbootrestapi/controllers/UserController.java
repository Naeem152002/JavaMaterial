package com.springmvcwihtspringbootrestapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvcwihtspringbootrestapi.entity.Register;

@Controller
public class UserController {

	@GetMapping("/home")
	@ResponseBody
	public String home() {
		return "my name is naeem kuraishi";
		
	}
	@PostMapping("/register")
	@ResponseBody
	public Register register(@RequestBody Register register) {
		return register;
		
	}
}
