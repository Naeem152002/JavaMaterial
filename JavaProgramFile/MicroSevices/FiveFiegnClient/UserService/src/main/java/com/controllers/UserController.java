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

import com.dto.UserDto;
import com.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
		UserDto  user1=userService.saveUser(userDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);

	}
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable int userId) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.updateUser(userDto, userId));
		
	}
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable int userId) {
		userService.deleteUser(userId);
		return ResponseEntity.status(HttpStatus.CREATED).body("User Deleted Successfully");
		
	}

	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable int userId) {
		UserDto userDto = this.userService.getSingleUser(userId);
		return ResponseEntity.ok(userDto);

	}

	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUser() {
		List<UserDto> allUser = this.userService.getAllUsers();
		return ResponseEntity.ok(allUser);

	}

}
