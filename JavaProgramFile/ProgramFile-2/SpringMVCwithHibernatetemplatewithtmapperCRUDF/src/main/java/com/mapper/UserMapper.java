package com.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dto.UserDto;
import com.entities.User;

@Component
public class UserMapper {
    @Autowired
    private ModelMapper modelMapper;

    public UserDto toDtO(User user) {
        return modelMapper.map(user,UserDto .class);
    }

    public User toEntity(UserDto userDtO) {
        return modelMapper.map(userDtO, User.class);
    }
}

