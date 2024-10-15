package com.service;

import com.dto.UserDto;
import com.response.UserResponse;

public interface UserService {
	
	public UserDto insertAdmin(UserDto userDto);
	public UserDto insertUser(UserDto userDto);
	public UserDto updateUser(UserDto userDto,int id);
	public void deleteUser(int id);
	public UserResponse getAllUsers(int pageNumber,int pageSize,String sortBy,String sortDir);
	public UserDto getSingleUser(int id);

}
