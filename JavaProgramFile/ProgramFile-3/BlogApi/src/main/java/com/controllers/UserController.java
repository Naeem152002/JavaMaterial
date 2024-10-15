package com.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.payloads.UserDto;
import com.response.ApiResponse;
import com.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<?> createUser(@Valid @RequestBody UserDto userDto) {
		UserDto Dto = userService.insertUser(userDto);
		if (Dto == null) {
			return new ResponseEntity<>("Email Already Registerd", HttpStatus.CONFLICT);
		} else {

			return	ResponseEntity.ok(Dto);
		}

	}
     @PutMapping("/{id}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable int id) {
		return new  ResponseEntity<UserDto>(userService.updateUser(userDto, id),HttpStatus.OK);
	}
     
     @DeleteMapping("/{id}")
     public ResponseEntity<ApiResponse> deleteUser(@PathVariable int id) {
    	 userService.deleteUser(id);
    	 return new  ResponseEntity<ApiResponse>(new ApiResponse("User Delted Successfully",true),HttpStatus.OK);
     }
     @GetMapping("/")
     public ResponseEntity<List<UserDto>> getAllUsers() {
    	 return ResponseEntity.ok(userService.getAllUsers());
     }
     
     @GetMapping("/{id}")
     public ResponseEntity<UserDto> getSingleUser(@PathVariable int id) {
    	 return ResponseEntity.ok(userService.getSingle(id));
     }
     
}
