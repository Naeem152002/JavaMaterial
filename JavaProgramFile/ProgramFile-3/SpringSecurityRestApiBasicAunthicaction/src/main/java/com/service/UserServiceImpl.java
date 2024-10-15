package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.config.AppConstants;
import com.dto.UserDto;
import com.entities.Role;
import com.entities.User;
import com.exceptions.ResourceNotFoundException;
import com.repo.RoleRepo;
import com.repo.UserRepo;
import com.response.UserResponse;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepo roleRepo;

	@Override
	public UserDto insertAdmin(UserDto userDto) {
		User check=userRepo.findByEmail(userDto.getEmail());
		System.out.println(check);
		if(check!=null) {
			return null;
	}else {
		User userEntintity = modelMapper.map(userDto, User.class);
		userEntintity.setPassword(this.passwordEncoder.encode(userEntintity.getPassword()));
		Role role=this.roleRepo.findById(AppConstants.ADMIN_USER).get();
		userEntintity.getRoles().add(role);
		User save = userRepo.save(userEntintity);
		UserDto dto = modelMapper.map(save, UserDto.class);
		return dto;
	}}
	@Override
	public UserDto insertUser(UserDto userDto) {
		User check=userRepo.findByEmail(userDto.getEmail());
		if(check!=null) {
		return null;
	}else {
		User userEntintity = modelMapper.map(userDto, User.class);
        userEntintity.setPassword(this.passwordEncoder.encode(userEntintity.getPassword()));
		Role role=this.roleRepo.findById(AppConstants.NORMAL_USER).get();
		userEntintity.getRoles().add(role);
		
		User newUser=this.userRepo.save(userEntintity);
		return this.modelMapper.map(newUser, UserDto.class);
	}}
	@Override
	public UserDto updateUser(UserDto userDto, int id) {
	        User user=this.userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User","Id",id));
	        user.setName(userDto.getName());
	        user.setEmail(userDto.getEmail());
	        user.setPassword(passwordEncoder.encode(user.getPassword()));
	        user.setMobile(userDto.getMobile());
	        
	        User updateUser = this.userRepo.save(user);
			UserDto dto = modelMapper.map(updateUser, UserDto.class);
			return dto;
	}

	@Override
	public void deleteUser(int id) {
		User user=this.userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User","Id",id));
		user.getRoles().clear();
        this.userRepo.save(user);

        // Delete the user
        this.userRepo.delete(user);
		
	}

	@Override
	public UserResponse getAllUsers(int pageNumber, int pageSize, String sortBy, String sortDir) {
		Sort sort=null;
		if(sortDir.equals("asc")) {
			sort=Sort.by(sortBy).ascending();
		}
		else {
			sort=Sort.by(sortBy).descending();
		}
		
		Pageable p=PageRequest.of(pageNumber, pageSize, sort);
		Page<User>pageUser=userRepo.findAll(p);
		List<User>allUsers=pageUser.getContent();
		List<UserDto>userDtos=allUsers.stream().map((user)->this.modelMapper.map(user,UserDto.class)).collect(Collectors.toList());
		
		UserResponse userResponse=new UserResponse();
		userResponse.setContent(userDtos);
		userResponse.setPageNumber(pageUser.getNumber());
		userResponse.setPageSize(pageUser.getSize());
		userResponse.setTotalElements(pageUser.getTotalElements());
		userResponse.setTotalPages(pageUser.getTotalPages());
		userResponse.setLastPage(pageUser.isLast());
		
		
		
		return userResponse;
	}

	@Override
	public UserDto getSingleUser(int id) {
		User user=userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User","Id",id));
		  return this.modelMapper.map(user, UserDto.class);
	}
	

}
