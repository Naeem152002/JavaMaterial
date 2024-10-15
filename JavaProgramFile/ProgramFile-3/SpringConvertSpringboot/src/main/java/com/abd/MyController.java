package com.abd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private UserService userService;

	@Value("${my.appName}")
	private String data;
	
	@GetMapping(value = "/hi")
	public String hhiii()
	{
		return data;
		
	}
	@GetMapping(value = "/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
		
	}

 
	
}
