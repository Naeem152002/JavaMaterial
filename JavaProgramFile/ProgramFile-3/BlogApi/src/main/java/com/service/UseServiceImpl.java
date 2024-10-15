package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.config.AppConstants;
import com.entities.Role;
import com.entities.User;
import com.exceptions.ResourceNotFoundException;
import com.payloads.UserDto;
import com.repo.RoleRepo;
import com.repo.UserRepo;
@Service
public class UseServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepo roleRepo;
	

	@Override
	public UserDto insertAdmin(UserDto userDto) {
		User use=this.userRepo.findByEmail(userDto.getEmail());
		if(use!=null) {
			return null;
		}else {
		User user=modelMapper.map(userDto, User.class);
		Role role=roleRepo.findById(AppConstants.ADMIN_USER).get();
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.getRoles().add(role);
		User save=userRepo.save(user);
		UserDto dto=modelMapper.map(save, UserDto.class);
		return dto;
	}}

	@Override
	public UserDto insertUser(UserDto userDto) {
		User use=userRepo.findByEmail(userDto.getEmail());
		if(use!=null) {
			return null;
		}else {
		User user=modelMapper.map(userDto, User.class);
		Role role=roleRepo.findById(AppConstants.NORMAL_USER).get();
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.getRoles().add(role);
		User save=userRepo.save(user);
		UserDto dto=modelMapper.map(save, UserDto.class);
		return dto;
	}}
	@Override
	public UserDto updateUser(UserDto userDto, int id) {
		User user=this.userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "Id", id));
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(passwordEncoder.encode(userDto.getPassword()));
		user.setAbout(passwordEncoder.encode(userDto.getAbout()));
		User save=userRepo.save(user);
		UserDto dto=modelMapper.map(save, UserDto.class);
		return dto;
	}

	@Override
	public void deleteUser(int id) {
		User user=userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		user.getRoles().clear();
        this.userRepo.save(user);
		userRepo.delete(user);
		
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User>allUsers=this.userRepo.findAll();
    List<UserDto>dtos=allUsers.stream().map(user->modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
    return dtos;
	}

	@Override
	public UserDto getSingle(int id) {
		User user=userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		return modelMapper.map(user, UserDto.class);
	}

}
