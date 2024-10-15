package com.example.service;

import java.util.List;

import com.example.dto.UserDto;

public interface UserService {
	public boolean insert(UserDto userDto);
	public UserDto getByNameAndEmail(UserDto userDto);
	public List<UserDto>getAllUsers();
	public UserDto getById(int id);
	public boolean updateUser(UserDto userDto);
	public boolean deleteUser(int id);

}
