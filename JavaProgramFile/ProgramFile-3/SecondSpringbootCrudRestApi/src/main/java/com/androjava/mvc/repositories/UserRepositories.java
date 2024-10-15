package com.androjava.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.androjava.mvc.entities.User;

@Repository
public interface UserRepositories extends JpaRepository<User,Integer>
{

public 	User  findByEmailAndPass(String email,String pass);

}
