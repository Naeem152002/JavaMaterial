package com.blogapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogapplication.payloads.UserDto;
import com.blogapplication.response.ApiResponse;
import com.blogapplication.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	@PostMapping(value="/register")
	public ResponseEntity<UserDto>createUser(@Valid @RequestBody UserDto userDto){
		UserDto createUserDto=this.userService.createUser(userDto);
		return new ResponseEntity<UserDto>(createUserDto,HttpStatus.CREATED);
	}
	
	@PutMapping(value="/{userId}")
	public ResponseEntity<UserDto>updateUser(@Valid @RequestBody UserDto userDto ,@PathVariable("userId") int Id){
UserDto updateUser=this.userService.updateUser(userDto, Id);
return ResponseEntity.ok(updateUser);

}    //@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping(value="/{userId}")
	public ResponseEntity<ApiResponse>deleteUser(@PathVariable int userId){
	this.userService.deleteUser(userId);
	return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted Sucessfully",true),HttpStatus.OK);
	}
	@GetMapping(value="/")
	public ResponseEntity<List<UserDto>>getAllUsers(){
		return ResponseEntity.ok(this.userService.getAllUsers());
		
	}
	@GetMapping(value="/{userId}")
	public ResponseEntity<UserDto>getSingleUser(@PathVariable int userId){
		return ResponseEntity.ok(this.userService.getUserById(userId));
		
	}
	
	
	}
	
