package com.dao;

import java.util.List;

import com.dto.User;

public interface UserDao {
	public void insert(User dto);
	public User getByEmailAndName(User dto);
	public List<User> getAllUsers();
	public User getByUserId(int id);
	public void updateUser(User dto);
	public void deleteUser(int id);

}
