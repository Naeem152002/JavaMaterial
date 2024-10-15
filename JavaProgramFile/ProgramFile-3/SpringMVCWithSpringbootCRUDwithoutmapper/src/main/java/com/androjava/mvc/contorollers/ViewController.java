package com.androjava.mvc.contorollers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.androjava.mvc.entities.User;
import com.androjava.mvc.service.UserService;

@Controller
public class ViewController {
	@Autowired
	public UserService service;
	@GetMapping(value = "/")
	public String homepage()
	{return "login";	
	}
	@GetMapping(value = "/register")
	public String registerPage()
	{
		return "register";	
	}
	@GetMapping(value = "/go")
	public String getAllUsers(Model model)
	{
		List<User> allUsers = service.getAllUsers(); 
		model.addAttribute("userList",allUsers);
		return "welcome";
	}
	
	@GetMapping("/updateJsp")
	 public String update(@RequestParam("id") int id, Model model) {
			model.addAttribute("User",service.getUserById(id));
			return "update";
		}
	@GetMapping("/deleteJsp")
	public String deleteJsp(@RequestParam("id") int id) {
		User user = service.getUserById(id);
		service.deleteUser(user);
		 return"redirect:/go";
	}
	
}

