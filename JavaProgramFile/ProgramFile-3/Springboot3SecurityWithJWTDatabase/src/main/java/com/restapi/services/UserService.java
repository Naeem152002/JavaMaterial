package com.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.entities.User;


@Service
public class UserService {
	
	ArrayList<User>list=new ArrayList<User>();
	
	
	public UserService() {
		list.add(new User("Naeem","1234","naeem@gmail.com","8349349393"));
		list.add(new User("Gufran","8494","gufran@gmail.com","8349349393"));
		list.add(new User("Akash","3e8393","gufran@gmail.com","8349349393"));
		
	}
	
	public List<User>getAllUsers(){
		return this.list;
	}
	
	
	public User getSingleUser(String  name) {
		return list.stream().filter(user->user.getName().equals(name)).findAny().orElse(null);
	}
	
	public User addUser(User user) {
		
		this.list.add(user);
		return user;
	}

}
