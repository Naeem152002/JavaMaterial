package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.LoginDto;
import com.dto.UserDto;
import com.entities.UserEntity;
import com.mapper.UserMapper;
import com.repositories.UserRepository;

@Service
public class UserServiceDaoImpl implements UserService{
	
	@Autowired
	public UserRepository repository;
	
	@Autowired
	public ModelMapper modelMapper;
	
	@Override
	public UserDto addUser(UserDto userDto) {
		if(repository.findByEmail(userDto.getEmail())==null) {
		UserEntity userEntity=modelMapper.map(userDto, UserEntity.class);
		 repository.save(userEntity);
		 return modelMapper.map(userEntity, UserDto.class);
		}else
			return null;
	}
	
	@Override
	public UserDto getUserById(int id) { 
		UserEntity user = null;
		try {
			user = (UserEntity) repository.getById(id);
			return modelMapper.map(user, UserDto.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			return null;
		}
			
	}

	@Override
	public List<UserDto> findAll() {
		List<UserEntity> list = repository.findAll();
		List<UserDto> list2 = list.stream().map((e)->modelMapper.map(e, UserDto.class)).collect(Collectors.toList());
		return list2;
	}

	@Override
	public void update(UserDto userDto) {
		UserEntity userEntity=modelMapper.map(userDto, UserEntity.class);
	 	repository.save(userEntity);
	}
	
	@Override
	public void update(LoginDto userDto) {
		UserEntity userEntity=modelMapper.map(userDto, UserEntity.class);
	 	repository.save(userEntity);
	}

	@Override
	public void delete(UserDto userDto) {
		repository.delete(modelMapper.map(userDto, UserEntity.class));
	}

	@Override
	public LoginDto findByEmailAndPassword(String email, String password) {
		UserEntity userEntity = repository.findByEmailAndPassword(email, password);
		if(userEntity!=null) {
		return modelMapper.map(userEntity, LoginDto.class);
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
