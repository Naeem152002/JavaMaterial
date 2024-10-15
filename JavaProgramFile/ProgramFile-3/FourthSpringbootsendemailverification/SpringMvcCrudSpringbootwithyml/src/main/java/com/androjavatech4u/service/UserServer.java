package com.androjavatech4u.service;

import java.util.List;

import com.androjavatech4u.dto.UserDto;
import com.androjavatech4u.entities.UserEntintity;

public interface UserServer {
	
 public UserDto registerUser(UserDto userDto);
 public UserDto loginUser(UserDto userDto);
 public List<UserEntintity>  findAllUser();
 public String updateUser(UserDto dto);
 public String deleteUser(UserDto dto);
 
}
