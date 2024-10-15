package com.androjava.mvc.contorollers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.androjava.mvc.dto.UserDto;
import com.androjava.mvc.entities.User;
import com.androjava.mvc.service.UserService;

@Controller
public class ViewController {
	@Autowired
	public UserService service;
	@GetMapping(value = "/")
	public String homePage(Model model) {
	model.addAttribute("title","LoginPage");
		return "login";
	}
	@GetMapping(value = "/register")
	public String registerPage(Model model) {
	model.addAttribute("title","RegisterPage");
		return "register";
	}
	@GetMapping(value = "/go")
	public String welcomeGo(Model model)
	{
		List<User> findAllUser = service.findAllUser();
		model.addAttribute("userList",findAllUser);
		return "welcome";
	}
	
	@GetMapping("/updateJsp")
	 public String update(@RequestParam("id") String id, Model model) {
			model.addAttribute("UserDto",service.getUserById(Integer.parseInt(id)));
			return "update";
		}
	@GetMapping("/deleteJsp")
	public String deleteJsp(@RequestParam("id") String id) {
		UserDto user = service.getUserById(Integer.parseInt(id));
		service.deleteUser(user);
		 return"redirect:/go";
	}
	
}
