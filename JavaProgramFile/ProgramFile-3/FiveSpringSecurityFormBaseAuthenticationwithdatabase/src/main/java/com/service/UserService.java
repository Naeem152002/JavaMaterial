package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.User;
import com.repo.UserRepo;
@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	
	List<User>list=new ArrayList<User>();
	
	
	public UserService() {
		list.add(new User("Naeem","naeem@123","naeem@gmail.com"));
		list.add(new User("Gufran","gufran@123","gufran@gmail.com"));
	}
	
	public List<User>getAllUsers(){
		return userRepo.findAll();
	}
	
	public User getSingleUser(String name) {
		return this.list.stream().filter((user)->user.getUserName().equals(name)).findAny().orElse(null);
	}
public User addUser(User user) {
	this.list.add(user);
	return user;
}
	
}
