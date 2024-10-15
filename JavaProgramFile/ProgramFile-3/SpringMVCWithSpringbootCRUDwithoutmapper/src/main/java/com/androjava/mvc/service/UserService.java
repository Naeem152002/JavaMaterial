package com.androjava.mvc.service;

import java.util.List;

import com.androjava.mvc.dto.UserDto;
import com.androjava.mvc.entities.User;

public interface UserService {

	public User userLogin(String email,String pass);
	public User insert(User user); 
	public User getUserById(int id);
	public List<User> getAllUsers();
	public void deleteUser(User user) ;
	public void updateUser(User user) ;
	
	
}
