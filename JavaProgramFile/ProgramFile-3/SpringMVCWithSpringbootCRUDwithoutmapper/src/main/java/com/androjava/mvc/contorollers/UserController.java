package com.androjava.mvc.contorollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.androjava.mvc.entities.User;
import com.androjava.mvc.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	public UserService service;
	@PostMapping(value = "/doRegister")
	public String userRegister(@ModelAttribute User user,Model model)
	{
		User registerUser= service.insert(user);
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
	public String userLogin(@ModelAttribute User user ,Model model)
	{
		User loginUser = service.userLogin(user.getEmail(),user.getPass());
		if(loginUser!=null) {
			 model.addAttribute("msg","Login Successfully");
			 return "redirect:/go";
			 }
			 else {
			model.addAttribute("msg","Error!!");
				return "register";
			 }
	}
	@PostMapping("/doedit")
    public String editUserForm(Model model ,User user ) {
	    service.updateUser(user);
	    return"redirect:/go";
    }		
}
