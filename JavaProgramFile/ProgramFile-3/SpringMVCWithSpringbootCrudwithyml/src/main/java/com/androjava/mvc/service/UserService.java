package com.androjava.mvc.service;

import java.util.List;

import com.androjava.mvc.dto.UserDto;
import com.androjava.mvc.entities.User;


public interface UserService {
	
 public UserDto registerUser(UserDto userDto);
 public UserDto loginUser(UserDto userDto);
 public List<User>  findAllUser();
 public void updateUser(UserDto userDto);
 public void deleteUser(UserDto userDto);
 UserDto getUserById(int id);
}
