package com.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.dto.UserDto;
import com.restapi.helper.MyResponseHandler;
import com.restapi.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v2")
public class UserController {
	@Autowired
	private UserService service;
	
	//public ModelMapper modelMapper=UserMapper.modelMapper();
	
	@PostMapping("/register")
	public ResponseEntity<Object> register(@Valid @RequestBody UserDto dto, BindingResult bindingResult, Error error) {
		if(bindingResult.hasErrors()) {
        
			System.out.println("step one "+bindingResult);
			//return new ResponseEntity<>(dto,HttpStatus.FORBIDDEN);
			 return MyResponseHandler.getHandler(HttpStatus.FORBIDDEN, true, bindingResult.toString(), dto) ;
		}else {
			String user = service.addUser(dto);
			String name = dto.getName();
			//UserEntity userEntity=modelMapper.map(dto, UserEntity.class);
			System.out.println("step2 ");
			  return MyResponseHandler.getHandler(HttpStatus.OK, true, name, dto) ;
		}
		
	}
	
	
}
