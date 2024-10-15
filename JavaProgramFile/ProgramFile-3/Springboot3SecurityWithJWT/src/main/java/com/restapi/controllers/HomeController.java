package com.restapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entities.User;
import com.restapi.services.UserService;


@RestController
@RequestMapping("/home")
public class HomeController {
	
	
	@Autowired
	private UserService userService;

	@GetMapping("/users")
    public List<User> getUser() {
        return this.userService.getUsers();
    }


}