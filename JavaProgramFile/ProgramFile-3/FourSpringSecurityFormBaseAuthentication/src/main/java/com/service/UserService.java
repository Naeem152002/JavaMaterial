package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.entities.User;
@Service
public class UserService {
	
	
	List<User>list=new ArrayList<User>();
	
	
	public UserService() {
		list.add(new User("Naeem","naeem@123","naeem@gmail.com","8756822036"));
		list.add(new User("Gufran","gufran@123","gufran@gmail.com","7860234587"));
	}
	
	public List<User>getAllUsers(){
		return this.list;
	}
	
	public User getSingleUser(String name) {
		return this.list.stream().filter((user)->user.getName().equals(name)).findAny().orElse(null);
	}
public User addUser(User user) {
	this.list.add(user);
	return user;
}
	
}
