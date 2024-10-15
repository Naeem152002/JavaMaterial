package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.User;
import com.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public List<User>getAllUsers(){
		return userService.getAllUsers();
	}
	@GetMapping("/{name}")
	public User getSingleUser(@PathVariable String name){
		return userService.getSingleUser(name);
	}
	@PostMapping("/register")
	public User addUser(@RequestBody User user){
		return userService.addUser(user);
	}

}
