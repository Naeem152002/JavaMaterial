package com.service;

import java.util.List;

import com.dto.User;

public interface UserService {
	public boolean insert(User dto);
    public User getByEmailAndName(User dto);
    public List<User> getAllUsers();
    public User getUsersById(int id);
    public boolean updateUser(User dto);
    public boolean deleteUser(int id);
}
