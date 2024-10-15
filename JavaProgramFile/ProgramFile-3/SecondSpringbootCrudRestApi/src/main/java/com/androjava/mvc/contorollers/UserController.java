package com.androjava.mvc.contorollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.androjava.mvc.dto.UserDto;
import com.androjava.mvc.entities.User;
import com.androjava.mvc.service.UserService;

@Controller
@ResponseBody
public class UserController {
	
	@Autowired
	public UserService service;
	@GetMapping(value = "/doView")
	public List<User> welcomeGo()
	{
		return  service.findAllUser();
	
	}
	@PostMapping(value = "/doRegister")
	public String doRegister(@RequestBody UserDto dto)
	{ 
	UserDto userDto = service.registerUser(dto);
		 if(userDto!=null) {
		return "Register Successfully!!";
		 }
		 else {
			return "Error!!";
		 }
				 }
	@PostMapping(value = "/doLogin")
	public String doLogin( @RequestBody UserDto userDto)
	{
		UserDto dto = service.loginUser(userDto);
		if(dto!=null) {
			 return "Login Sucessfully";
			 }
			 else {
				return "Error!!";
			 }
		

	}

	 @PutMapping("{id}")
    public  List<User> editUserForm(@PathVariable int id,@RequestBody UserDto userDto ) {
	    service.updateUser(userDto);
	    return  service.findAllUser();
	   
    }
	 @DeleteMapping("{id}")
		public List<User>  deleteJsp(@PathVariable int id  ) {
			UserDto user = service.getUserById(id);
			service.deleteUser(id,user);
			return  service.findAllUser();
		
	}
}

	


