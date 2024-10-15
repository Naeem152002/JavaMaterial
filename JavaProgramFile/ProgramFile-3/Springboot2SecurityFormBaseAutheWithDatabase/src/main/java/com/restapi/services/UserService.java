package com.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.entities.User;

@Service
public class UserService {
	
	
	List<User>list=new ArrayList<>();
	
	public UserService() {
		this.list.add(new User("Naeem","1234","naeem@gmail.com"));
		this.list.add(new User("Gufran","5678","gufran@gmail.com"));
	}
	
	
	public List<User>getAllUsers(){
		return this.list;
	}

public User getUser(String userName) {
	return this.list.stream().filter((user)->user.getUserName().equals(userName)).findAny().orElse(null);
}

public User addUser(User user) {
	this.list.add(user);
	return user;
}
}
