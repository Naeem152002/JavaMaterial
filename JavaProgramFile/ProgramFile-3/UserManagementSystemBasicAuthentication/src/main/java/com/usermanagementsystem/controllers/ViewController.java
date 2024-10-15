package com.usermanagementsystem.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ViewController {
	
	@GetMapping("/view")
	public String getMethodName() {
		return "this is view";
	}
	

}
