package com.restapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entities.User;
import com.restapi.services.UserService;


@RestController
@RequestMapping("/api")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User>getAllusers(){
		return this.userService.getAllUsers();
	}
	@GetMapping("/{name}")
	public User getSingleUser(@PathVariable String name){
		return this.userService.getSingleUser(name);
	}
	@PostMapping("/")
	public User addUser(User user){
		return this.userService.addUser(user);
	}

}
