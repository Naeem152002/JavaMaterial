package com.restapi.service;

import java.util.List;

import com.restapi.dto.UserDto;





public interface UserService
{
	    String addUser(UserDto user);
	    UserDto addUserById(int id);
	    List<UserDto> findAll();
	    void update(UserDto user);
	    void delete(int id);
	    UserDto findByEmailAndPassword(String email, String password);
	    public List<UserDto> getUsersNameAndEmail(String name,String email);
		UserDto getUserById(int id);
		void delete(UserDto dto);
}
