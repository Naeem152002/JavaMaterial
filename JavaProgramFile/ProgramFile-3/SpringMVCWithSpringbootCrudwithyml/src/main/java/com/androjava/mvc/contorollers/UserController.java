package com.androjava.mvc.contorollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.androjava.mvc.dto.UserDto;
import com.androjava.mvc.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	public UserService service;
	@PostMapping(value = "/doRegister")
	public String doRegister(@ModelAttribute UserDto dto,Model model)
	{ 
		
		UserDto registerUser = service.registerUser(dto);
		 if(registerUser!=null) {
		 model.addAttribute("msg","Register Successfully");
		return "login";
		 }
		 else {
		model.addAttribute("msg","Error!!");
			return "register";
		 }
				 }
	@PostMapping(value = "/doLogin")
	public String doLogin(@ModelAttribute UserDto userDto, Model model)
	{
		model.addAttribute("title", "AndrojavaTech4U");
		UserDto loginUser = service.loginUser(userDto);
		if(loginUser!=null) {
			 model.addAttribute("msg","welcomePage");
			 return "redirect:/go";
			 }
			 else {
			model.addAttribute("msg","Error!!");
				return "register";
			 }
	}

 @PostMapping("/doedit")
    public String editUserForm(Model model ,UserDto userDto ) {
	    service.updateUser(userDto);
	    return"redirect:/go";
    }

}

	


