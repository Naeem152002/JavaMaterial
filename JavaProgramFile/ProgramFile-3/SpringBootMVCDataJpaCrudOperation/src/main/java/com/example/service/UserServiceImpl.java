package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.UserDto;
import com.example.entities.User;
import com.example.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@Override
	public boolean insert(UserDto userDto) {
	User entity=modelMapper.map(userDto, User.class);
		if((entity.getName().trim().isEmpty())) {
			return false;
		}
		User save=userRepo.save(entity);
		return true;
	}

	@Override
	public UserDto getByEmailAndName(UserDto userDto) {
		User entity=modelMapper.map(userDto, User.class);
		User save=userRepo.findByNameAndEmail(entity.getName(), entity.getEmail());
		if(save==null) {
			return null;
		}
		UserDto dto=modelMapper.map(save, UserDto.class);
		return dto;
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User>users=userRepo.findAll();
		List<UserDto>userDtos=users.stream().map(user->modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
        return userDtos;
	}

	@Override
	public UserDto getById(int id) {
	Optional<User> userOptional=userRepo.findById(id);
		return modelMapper.map(userOptional.get(), UserDto.class);
	}

	@Override
	public boolean updateUser(UserDto userDto) {
		User entity=modelMapper.map(userDto, User.class);
		userRepo.save(entity);
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
	            userRepo.deleteById(id);
	            return true;
	}
	
}
