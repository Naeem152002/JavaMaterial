package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.entities.User;


@Service
public class UserService {
	
	List<User>list=new ArrayList<User>();
	
	
	public UserService() {
		this.list.add(new User("Naeem","naeem@gmail.com","234567891","8765493021"));
		this.list.add(new User("Gufran","gufran@gmail.com","84949494","8765493021"));
		this.list.add(new User("Khalid","gufran@gmail.com","8549494","8765493021"));
	}
	
	
	public List<User>getAllUsers(){
		return this.list;
	}
	
	
	public User getSingleUser(String name) {
		return this.list.stream().filter(user->user.getName().equals(name)).findAny().orElse(null);
	}

	
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
