package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.UserDto;
import com.example.entitis.User;
import com.example.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;
	

	@Autowired
	private ModelMapper modelMapper;


	@Override
	public boolean insert(UserDto userDto) {
		User user=modelMapper.map(userDto, User.class);
		if(user.getMobile().trim().isEmpty()) {
			return false;
		}
		userRepo.insert(user);
		return true;
	}


	@Override
	public UserDto getByNameAndEmail(UserDto userDto) {
		User user=modelMapper.map(userDto, User.class);
		User save=userRepo.getByNameAndEmail(user.getName(),user.getEmail());
		if(save.getName().trim().isEmpty()) {
			return null;
		}
		UserDto dto=modelMapper.map(save, UserDto.class);
		return dto;
	}


	@Override
	public List<UserDto> getAllUsers() {
		List<User>users=userRepo.getAllUsers();
		List<UserDto>userDtos=users.stream().map(user->modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
		return userDtos;
	}


	@Override
	public UserDto getById(int id) {
		User user=userRepo.getById(id);
	UserDto dto=modelMapper.map(user, UserDto.class);
		return dto;
	}


	@Override
	public boolean updateUser(UserDto userDto) {
		User user=modelMapper.map(userDto, User.class);
		userRepo.updateUser(user);
		return true;
	}


	@Override
	public boolean deleteUser(int id) {
		userRepo.deleteUser(id);
		return true;
	}

	
}
