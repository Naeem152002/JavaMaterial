package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.User;

public interface UserRepo extends JpaRepository<User, String> {
	
	public User findByName(String name);

}
