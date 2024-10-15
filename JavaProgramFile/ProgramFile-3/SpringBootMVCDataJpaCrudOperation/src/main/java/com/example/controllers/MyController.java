package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dto.UserDto;
import com.example.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	UserService userService;
	
	
	@GetMapping("/")
	public String registerPage(Model model) {
		model.addAttribute("msg", "Register Page");
		return "register";
	}
	@GetMapping("/loginPage")
	public String loginPage(Model model) {
		model.addAttribute("msg", "Login Page");
		return "login";
	}
	@PostMapping("/doRegister")
	public String registerUser(@ModelAttribute UserDto userDto,Model model) {
		System.out.println(userDto);
		boolean check=userService.insert(userDto);
		if(check) {
			model.addAttribute("msg", "Register Successfully");
			return "login";
		}else {
		model.addAttribute("msg", "Does not login!! Error");
		return "register";
	}
	}
	@PostMapping("/doLogin")
	public String loginUser(UserDto userDto,Model model,HttpSession session) {
		session.setAttribute("name", userDto.getName());
		session.setAttribute("email", userDto.getEmail());
		UserDto check=userService.getByEmailAndName(userDto);
		if(check!=null) {
			model.addAttribute("msg1", "Welcome Page");
			model.addAttribute("msg2", "Login Successfylly");
			model.addAttribute("msg3", "Name:"+(String)session.getAttribute("name")+"Email:"+(String)session.getAttribute("email"));
			model.addAttribute("msg4", "<a href='logout'>LogOut</a>");
			model.addAttribute("msg5", "<a href='view'>View</a>");
			return "welcome";
		}
		else {
			model.addAttribute("msg", "Does not login!!Error");
			return "login";
	}
	}
	@GetMapping("/logout")
	public String logoutPage(Model model) {
		model.addAttribute("msg", "LogOut Page");
		return "logout";
	}
	
	@GetMapping("/view")
	public String getAllUsers(Model model) {
            model.addAttribute("msg", "Welcome Users");
			model.addAttribute("users", userService.getAllUsers());
			return "views";
	}
	@GetMapping("/edit")
	public String editPage(@RequestParam int id,Model model) {
		model.addAttribute("msg", "Update Page");
		model.addAttribute("userDto", userService.getById(id));
		return "update";
	}
	@PostMapping("/doEdit")
	String updateUser(UserDto dto,Model model) {
		boolean check=userService.updateUser(dto);
		if(check) {
		model.addAttribute("msg","Successfully Updated");
		model.addAttribute("users",userService.getAllUsers());	
		return "views";
	}else {
		model.addAttribute("msg","Does not updated!! Error");
		model.addAttribute("users",userService.getAllUsers());
		return "views";
	}
	}
		@GetMapping("/delete")
		String deleteUser(@RequestParam int id,Model model) {
			boolean check=userService.deleteUser(id);
			if(check) {
				model.addAttribute("msg","Successfully Deleted");
				model.addAttribute("users",userService.getAllUsers());
				return "views";
			}else {
				model.addAttribute("msg","Does not Deleted!! Error");
				model.addAttribute("users",userService.getAllUsers());
				return "views";
			}
	}
	
}