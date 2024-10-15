package com.androjava.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androjava.mvc.dto.UserDto;
import com.androjava.mvc.entities.User;
import com.androjava.mvc.repositories.UserRepositories;
 

@Service
public class UserServiceImpl implements UserService
{
	
	@Autowired
	public UserRepositories repositories;

	@Override
	public User insert(User user) {
		// TODO Auto-generated method stub
		return repositories.save(user);
	}

	@Override
	public User getUserById(int id) {
		User user=(User)repositories.getById(id);
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> userList = repositories.findAll();
		return userList;
	}

	@Override
	public void deleteUser(User user) {
		repositories.delete(user);
	}

	@Override
	public void updateUser(User user) {
		repositories.save(user);
		
	}

	@Override
	public User userLogin(String email, String pass) {
		User user = repositories.findByEmailAndPass(email, pass);
		return user;
	}
 
 

}
