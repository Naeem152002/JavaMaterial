package com.example.repo;

import java.util.List;

import com.example.entitis.User;
public interface UserRepo  {
	public void insert(User user);
	public User getByNameAndEmail(String name,String email);
	public List<User>getAllUsers();
	public User getById(int id);
	public void updateUser(User user);
	public void deleteUser(int id);
	

}
