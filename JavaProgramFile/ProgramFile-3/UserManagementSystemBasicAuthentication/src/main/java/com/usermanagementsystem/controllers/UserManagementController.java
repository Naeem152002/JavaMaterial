package com.usermanagementsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagementsystem.dto.UserDto;
import com.usermanagementsystem.response.ApiResponse;
import com.usermanagementsystem.services.UserService;


@RestController
public class UserManagementController {

	@Autowired
	private UserService userService;
	


	@PostMapping("/admin/register")
	public ResponseEntity<?> createAdmin(@RequestBody UserDto userDto) {
		UserDto dto = userService.createAdmin(userDto);
		if (dto == null) {
			return new ResponseEntity<>("Email Already Exist", HttpStatus.CONFLICT);
		} else {
			return new ResponseEntity<UserDto>(dto, HttpStatus.OK);
		}
	}
	@PutMapping("/admin/{id}")
	public ResponseEntity<?> updateUser(@RequestBody UserDto userDto, @PathVariable int id) {
		UserDto dto = userService.updateUser(userDto, id);
		if (dto == null) {
			return new ResponseEntity<>("Email Already Exist", HttpStatus.CONFLICT);
		} else {
			return new ResponseEntity<UserDto>(dto, HttpStatus.OK);
		}
	}
	@GetMapping("/admin/{id}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable int id) {
		return  ResponseEntity.ok(userService.getSingleUserById(id));
	}
	@GetMapping("/admin/")
	public ResponseEntity<List<UserDto> >getAllUsers() {
		return  ResponseEntity.ok(userService.getAllUsers());
	}
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
		
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully", true), HttpStatus.OK);
	}
	@PostMapping("/admin-user/register")
	public ResponseEntity<?> createUser(@RequestBody UserDto userDto) {
		UserDto dto = userService.createUser(userDto);
		if (dto == null) {
			return new ResponseEntity<>("Email Already Exist", HttpStatus.CONFLICT);
		} else {
			return new ResponseEntity<UserDto>(dto, HttpStatus.OK);
		}
	}
	@GetMapping("/admin-user/profile")
    public ResponseEntity<UserDto> getMyProfile(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        return  ResponseEntity.ok(userService.getProfile(email));
    }
	@PutMapping("/admin-user/profile/update")
	public ResponseEntity<UserDto> updateProfile(@RequestBody UserDto userDto){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String email = authentication.getName();
		return  ResponseEntity.ok(userService.updateProfile(userDto,email));
	}
	@DeleteMapping("/admin-user/profile/delete")
	public ResponseEntity<ApiResponse> deleteProfile(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String email = authentication.getName();
		userService.deleteProfile(email);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully", true), HttpStatus.OK);
	}

}
	

