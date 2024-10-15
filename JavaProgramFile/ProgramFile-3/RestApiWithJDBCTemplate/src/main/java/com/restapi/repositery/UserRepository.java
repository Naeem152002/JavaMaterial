package com.restapi.repositery;

import java.util.List;

import com.restapi.user.User;

public interface UserRepository {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void update(User user);
    void delete(Long id);
}

