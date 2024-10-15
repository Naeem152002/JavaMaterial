package com.services;

import java.util.List;

import com.dto.UserDto;

public interface UserService {
	
	
	UserDto saveUser(UserDto userDto);
	UserDto updateUser(UserDto userDto,int userId);
	
	void deleteUser(int userId);
	
	
	UserDto getSingleUser(int userId);
	
	List<UserDto>getAllUsers();
	
	
	
	

}
