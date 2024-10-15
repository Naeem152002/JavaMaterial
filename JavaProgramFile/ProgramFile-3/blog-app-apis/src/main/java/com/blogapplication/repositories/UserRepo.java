package com.blogapplication.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapplication.entities.User;

public interface UserRepo extends JpaRepository<User,Integer> {

	public Optional<User>findByEmail(String email);
}
