package com.restapi.service;

import java.util.List;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.dto.UserDto;
import com.restapi.entities.UserEntity;
import com.restapi.mapper.UserMapper;
import com.restapi.repositories.UserRepository;

@Service
public class UserServiceDaoImpl implements UserService{
	
	@Autowired
	public UserRepository repository;
	public ModelMapper modelMapper=UserMapper.modelMapper();
	
	@Override
	public String addUser(UserDto userDto) {
		if(repository.findByEmail(userDto.getEmail())==null) {
		UserEntity userEntity=modelMapper.map(userDto, UserEntity.class);
		 repository.save(userEntity);
		 return "registration success";
		}else
			return null;
	}
	
	@Override
	public UserDto getUserById(int id) { 
		UserEntity user =(UserEntity) repository.getById(id);
		return modelMapper.map(user, UserDto.class);
	}

	@Override
	public List<UserDto> findAll() {
		return null;
	}

	@Override
	public void update(UserDto userDto) {
		UserEntity userEntity=modelMapper.map(userDto, UserEntity.class);
	 	repository.save(userEntity);
	}

	@Override
	public void delete(UserDto userDto) {
		repository.delete(modelMapper.map(userDto, UserEntity.class));
	}

	@Override
	public UserDto findByEmailAndPassword(String email, String password) {
		UserEntity userEntity = repository.findByEmailAndPassword(email, password);
		if(userEntity!=null) {
		return modelMapper.map(userEntity, UserDto.class);
		}
		else
			return null;
	}

	@Override
	public List<UserDto> getUsersNameAndEmail(String name, String email) {
		
		return null;
	}

	@Override
	public UserDto addUserById(int id) {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}

}
