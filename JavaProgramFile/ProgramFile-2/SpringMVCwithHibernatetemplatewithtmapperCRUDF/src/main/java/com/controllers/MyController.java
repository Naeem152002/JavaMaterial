package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.User;
import com.service.UserService;


	@Controller
	public class MyController {
	
	@Autowired
	public	UserService userService;
	
	@PostMapping(value="/doRegister")	
	public String registerUser(@ModelAttribute User user,Model model) {
		User user2=userService.save(user); 
	  if(user2!=null) {
		  model.addAttribute("msg","Registered Sucessfully");
			return "redirect:/";
	  } else
		  model.addAttribute("msg","Error!!");
			return "register";
		
	}
	
	@PostMapping(value="/doLogin")	
	public String getUsersNameAndEmail(String email,String password ,Model model) {
		 boolean check=userService.getUsersNameAndEmail(email, password);
		 if(check) {
			 model.addAttribute("msg","Login Sucessfully");
				return "redirect:/go";
		 }else {
			 model.addAttribute("msg","Register!!");
					return "register";	
			}}
	@GetMapping("/go")
    public String getAllUsers(Model model) {
	        model.addAttribute("userList", userService.findAll());
	        return "view"; // This corresponds to the name of your JSP file (users.jsp)
   }
	@GetMapping("/updateJsp")
	 public String update(@RequestParam("id") int id, Model model) {
			model.addAttribute("User",userService.getUserById(id));
			return "update";
		}
	 @PostMapping("/doedit")
	    public String editUserForm(Model model ,User user ) {
		    userService.updateUser(user);
		    return"redirect:/go";
	    }
	 @GetMapping("/deleteJsp")
		public String deleteJsp(@RequestParam("id") int id) {
			User user = userService.getUserById(id);
			userService.deleteUser(user);
			 return"redirect:/go";
		}
	} 
	
	