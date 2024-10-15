package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.dto.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public boolean insert(User dto) {
		userDao.insert(dto);
		return true;
	}

	@Override
	public User getByEmailAndName(User dto) {
		return userDao.getByEmailAndName(dto);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User getByUserId(int id) {
		return userDao.getByUserId(id);
	}

	@Override
	public boolean updateUser(User dto) {
		userDao.updateUser(dto);
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		userDao.deleteUser(id);
		return true;
	}

}
