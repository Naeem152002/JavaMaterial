package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dto.UserDto;
import com.entities.User;
import com.exceptions.ResourceNotFoundException;
import com.repo.UserRepo;
import com.response.UserResponse;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto insert(UserDto userDto) {
		User user=modelMapper.map(userDto, User.class);
		User save=userRepo.save(user);
		UserDto dto=modelMapper.map(save, UserDto.class);
		return dto;
	}

	@Override
	public UserDto updateUser(UserDto userDto, int id) {
	     User user= userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
	     user.setName(userDto.getName());
	     user.setEmail(userDto.getEmail());
	     user.setPassword(user.getPassword());
	     user.setMobile(user.getMobile());
	     UserDto dto=modelMapper.map(user, UserDto.class);
		return dto;
	}

	@Override
	public void deleteUser(int id) {
		 User user= userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		 this.userRepo.delete(user);
		
	}

	@Override
	public UserResponse getAllUsers(int pageNumber,int pageSize,String sortBy,String sortDir) {
           Sort sort=null;
		
		if(sortDir.equalsIgnoreCase("asc")) {
			sort=Sort.by(sortBy).ascending();
		}
		else {
			sort=Sort.by(sortBy).descending();
		}
		Pageable p=PageRequest.of(pageNumber, pageSize,sort);
		Page<User>pageUser=this.userRepo.findAll(p);
		List<User>allUsers=pageUser.getContent();
		List<UserDto>userDtos=allUsers.stream().map((user)->this.modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
		
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
	public UserDto getById(int id) {
		 User user= userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		 UserDto dto=modelMapper.map(user, UserDto.class);
		return dto;
	}

	

}
