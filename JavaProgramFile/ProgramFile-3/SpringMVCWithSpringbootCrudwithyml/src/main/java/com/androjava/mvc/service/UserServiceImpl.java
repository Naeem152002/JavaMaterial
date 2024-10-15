package com.androjava.mvc.service;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androjava.mvc.dto.UserDto;
import com.androjava.mvc.entities.User;
import com.androjava.mvc.mappers.UserMapper;
import com.androjava.mvc.repositories.UserRepositories;



@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	public UserRepositories repository;
	ModelMapper modelMapper = UserMapper.modelMapper();
	 
	public UserServiceImpl()
	{	
	}
	
	@Override
	public UserDto registerUser(UserDto userDto) {
		User userEntintity = modelMapper.map(userDto, User.class);
		User save = repository.save(userEntintity);
		UserDto dto = modelMapper.map(save, UserDto.class);
		return dto;
	}

	@Override
	public UserDto loginUser(UserDto userDto) {
		User userEntintity = modelMapper.map(userDto, User.class);
		User save = repository.findByEmailAndPass(userEntintity.getEmail(),userEntintity.getPass());
		UserDto dto = modelMapper.map(save, UserDto.class);
		return dto;
	}

	@Override
	public List<User>  findAllUser() {
		 
		return repository.findAll();
	}

	@Override
	public void updateUser(UserDto userDto) {
		User userEntity=modelMapper.map(userDto, User.class);
	 	repository.save(userEntity);
	}

	@Override
	public void deleteUser(UserDto userDto) {
		repository.delete(modelMapper.map(userDto, User.class));
	}

	@Override
	public UserDto getUserById(int id) { 
		User user =(User) repository.getById(id);
		return modelMapper.map(user, UserDto.class);
	}
	}

	

	

	

