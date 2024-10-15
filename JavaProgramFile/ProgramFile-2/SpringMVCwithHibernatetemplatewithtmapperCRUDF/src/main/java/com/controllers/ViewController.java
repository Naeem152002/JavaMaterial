package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.service.UserService;

	@Controller
	public class ViewController {
	
	@Autowired
	public	UserService userService;
	@GetMapping("/")	
	public String loginPage(Model model) {
		model.addAttribute("title","LoginPage" );
		return "login";
		}
	@GetMapping("/register")	
	public String registerPage(Model model) {
		model.addAttribute("title","RegisterPage" );
		return "register";
		
	}
	
}
