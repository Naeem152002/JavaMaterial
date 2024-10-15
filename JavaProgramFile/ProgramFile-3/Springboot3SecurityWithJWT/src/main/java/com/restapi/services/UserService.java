package com.restapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.restapi.entities.User;

@Service
public class UserService {
	
	
	private List<User>store=new ArrayList<>();
	
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Durgesh","durgesh@gmail.com"));
	
		store.add(new User(UUID.randomUUID().toString(),"Rahul","rahul@gmail.com"));
		
		store.add(new User(UUID.randomUUID().toString(),"Rohit","rohit@gmail.com"));
		
		store.add(new User(UUID.randomUUID().toString(),"Data","dada@gmail.com"));
		
	
	}
	
	public List<User>getUsers(){
		return this.store;
	}

}
