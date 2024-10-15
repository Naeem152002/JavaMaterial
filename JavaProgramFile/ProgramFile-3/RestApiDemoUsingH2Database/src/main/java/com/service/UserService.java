package com.service;

import java.util.List;

import com.dto.LoginDto;
import com.dto.UserDto;

public interface UserService
{
	    UserDto addUser(UserDto user);
	    UserDto addUserById(int id);
	    List<UserDto> findAll();
	    void update(UserDto user);
	    void update(LoginDto user);
	    void delete(int id);
	    LoginDto findByEmailAndPassword(String email, String password);
	    public List<UserDto> getUsersNameAndEmail(String name,String email);
		UserDto getUserById(int id);
		void delete(UserDto dto);
}
