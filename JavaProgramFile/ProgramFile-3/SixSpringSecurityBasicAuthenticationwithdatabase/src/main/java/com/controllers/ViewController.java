package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {
	
	@GetMapping("/loginPage")
	public String loginPage() {
		return "login";
	}

}
