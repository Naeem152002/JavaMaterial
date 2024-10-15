package com.androjavatech4u.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContoller {

	@GetMapping(value = "/")
	public String homePage(Model model)
	{
		model.addAttribute("title", "AndrojavaTech4U");
		return "index";
	}
	


	@GetMapping(value = "/login")
	public ModelAndView loginPage()
	{
		ModelAndView model=new ModelAndView("login");
		model.addObject("title", "AndrojavaTech4U-Login"); 
		return model;
	}
	
	
	
	
	
}
