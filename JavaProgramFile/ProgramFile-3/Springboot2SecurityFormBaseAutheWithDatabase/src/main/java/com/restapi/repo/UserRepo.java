package com.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.entities.User;

public interface UserRepo extends JpaRepository<User,String> {

	
	public User findByUserName(String userName);
}
