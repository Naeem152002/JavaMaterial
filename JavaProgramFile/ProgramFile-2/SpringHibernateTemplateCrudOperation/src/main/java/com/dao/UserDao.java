package com.dao;

import java.util.List;

import com.dto.User;

public interface UserDao {
	public boolean insert(User dto);
	public User getByEmailAndName(User dto);
	public List<User>getAllUsers();
	public User getById(int id);
	public boolean updateUser(User dto);
	public boolean deleteUser(int id);

}
