package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	public User findByNameAndEmail(String name,String Email);

}
