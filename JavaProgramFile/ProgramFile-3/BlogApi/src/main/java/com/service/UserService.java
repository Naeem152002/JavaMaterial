package com.service;

import java.util.List;

import com.payloads.UserDto;

public interface UserService {
	
	public UserDto insertAdmin(UserDto userDto);
	public UserDto insertUser(UserDto userDto);
	public UserDto updateUser(UserDto userDto ,int id);
	public void deleteUser(int id);
	public List<UserDto>getAllUsers();
	public UserDto getSingle(int id);

}
