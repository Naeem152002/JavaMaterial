package com.androjavatech4u.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.androjavatech4u.dto.UserDto;
import com.androjavatech4u.entities.UserEntintity;
import com.androjavatech4u.service.UserServer;

@Controller
public class UsersContoller {
	
	@Autowired
	public UserServer server;
	
	
	@PostMapping(value = "/doLogin")
	public String doLogin(@ModelAttribute UserDto userDto, Model model)
	{
		model.addAttribute("title", "AndrojavaTech4U");
		UserDto loginUser = server.loginUser(userDto);
		if(loginUser!=null)
		return "redirect:/go";
		else
			return "fail";	
	}
	
	@GetMapping(value = "/go")
	public String welcomeGo(Model model)
	{
		List<UserEntintity> findAllUser = server.findAllUser();
		model.addAttribute("userList",findAllUser);
		return "welcome";
	}

	
	


	@GetMapping(value = "/register")
	public String registerPage()
	{
		return "register";
	}


	@PostMapping(value = "/doRegister")
	public String doRegister(@ModelAttribute UserDto dto)
	{ 
		
		UserDto registerUser = server.registerUser(dto);
		 if(registerUser!=null)
		return "login";
		 else
		return null;
				 
	}
	
	

}
