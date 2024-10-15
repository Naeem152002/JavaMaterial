package com.abd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	List<User>list=new ArrayList<>();
	
	public UserService() {
		this.list.add(new User(1,"Naeem","484"));
		this.list.add(new User(2,"Gufran","849"));
		this.list.add(new User(3,"Khalid","494"));
		
	}
	
	List<User>getAllUsers(){
return this.list;
}
}