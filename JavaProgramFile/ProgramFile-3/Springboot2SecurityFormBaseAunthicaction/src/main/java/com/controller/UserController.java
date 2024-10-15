package com.controller;

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
//@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public List<User> getAllUsers() {

		return this.userService.getAllUsers();
	}
	@PostMapping("/{userName}")
	public User getUser(@PathVariable("userName") String userName) {
		return this.userService.getUser(userName);
	}
	
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
}