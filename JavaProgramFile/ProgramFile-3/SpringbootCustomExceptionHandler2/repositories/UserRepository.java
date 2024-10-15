package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	public UserEntity findByEmailAndPassword(String email, String password);
	public UserEntity findByEmail(String email);
}
