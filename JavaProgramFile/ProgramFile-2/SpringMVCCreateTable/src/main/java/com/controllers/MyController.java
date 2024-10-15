package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MyController  {
	
	@GetMapping("/")
	String registerPage(Model model) {
    	model.addAttribute("msg","Register Page");
		return "register";	
	}

   
   
   }


