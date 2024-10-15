package com.androjavatech4u.service;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.androjavatech4u.dto.UserDto;
import com.androjavatech4u.entities.UserEntintity;
import com.androjavatech4u.mappers.UserMapper;
import com.androjavatech4u.repositories.UserRepository;

@Service
public class UserServerImpl implements UserServer
{
	@Autowired
	public UserRepository repository;
	
	 
	public UserServerImpl()
	{	
	}
	
	@Override
	public UserDto registerUser(UserDto userDto) {
		
		ModelMapper modelMapper = UserMapper.modelMapper();
		UserEntintity userEntintity = modelMapper.map(userDto, UserEntintity.class);
		UserEntintity save = repository.save(userEntintity);
		UserDto dto = modelMapper.map(save, UserDto.class);
		return dto;
	}

	@Override
	public UserDto loginUser(UserDto userDto) {
		ModelMapper modelMapper = UserMapper.modelMapper();
		UserEntintity userEntintity = modelMapper.map(userDto, UserEntintity.class);
		UserEntintity save = repository.findByEmailAndPass(userEntintity.getEmail(),userEntintity.getPass());
		UserDto dto = modelMapper.map(save, UserDto.class);
		return dto;
	}

	@Override
	public List<UserEntintity>  findAllUser() {
		 
		return repository.findAll();
	}

	@Override
	public String updateUser(UserDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(UserDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
