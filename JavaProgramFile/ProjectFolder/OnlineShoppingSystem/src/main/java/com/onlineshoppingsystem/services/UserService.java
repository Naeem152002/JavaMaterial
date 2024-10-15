package com.onlineshoppingsystem.services;

import com.onlineshoppingsystem.dto.LoginRequest;
import com.onlineshoppingsystem.dto.Response;
import com.onlineshoppingsystem.model.User;


public interface UserService {

	public Response createUser(User user);
	public Response login(LoginRequest loginRequest) ;
	public Response updateUser(User user,Long id);
	public void deleteUser(Long id);
	public Response getSingleUserById(Long id);
	public Response getAllUsers();
	public Response getProfile(String email);
	public Response updateProfile(User user,String email);
	public void deleteProfile(String email);

      
}
