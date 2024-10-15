package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.config.AppConstants;
import com.dto.UserDto;
import com.response.ApiResponse;
import com.response.UserResponse;
import com.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService userService;
	

	@PostMapping("/register")
	public ResponseEntity<UserDto> registerUser(@Valid @RequestBody UserDto userDto) {
			return new ResponseEntity<UserDto>(this.userService.insert(userDto),HttpStatus.CREATED);
	}
	@PutMapping("/update/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable int  userId) {
			return ResponseEntity.ok(this.userService.updateUser(userDto, userId));
	}
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<ApiResponse>deleteUser(@PathVariable int userId) {
		this.userService.deleteUser(userId);
			return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully",true),HttpStatus.OK);
	}
	@GetMapping("/")
	public ResponseEntity<UserResponse> getAllPost(@RequestParam (defaultValue=AppConstants.PAGE_NUMBER,required=false)int pageNumber,
			@RequestParam (defaultValue=AppConstants.PAGE_SIZE,required=false)int pageSize,
			@RequestParam (defaultValue=AppConstants.SORT_BY,required=false)String sortBy,
			@RequestParam (defaultValue=AppConstants.SORT_DIR,required=false)String sortDir
			){
		UserResponse userResponse=this.userService.getAllUsers(pageNumber,pageSize,sortBy,sortDir);
		
		return new ResponseEntity<UserResponse>(userResponse,HttpStatus.OK);
		
	}
	@GetMapping(value="/{userId}")
	public ResponseEntity<UserDto>getSingleUser(@PathVariable int userId){
		return ResponseEntity.ok(this.userService.getById(userId));
		
	}
	
}
