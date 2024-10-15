package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
