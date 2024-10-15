package com.service;


import java.util.List;

import com.dto.UserDto;
import com.entities.User;

public interface UserService {
	User  save(User user);
    User getUserById(int id);
    List<User> findAll();
    void updateUser(User user);
    void deleteUser(User user);
    public boolean getUsersNameAndEmail(String email,String password) ;
}

