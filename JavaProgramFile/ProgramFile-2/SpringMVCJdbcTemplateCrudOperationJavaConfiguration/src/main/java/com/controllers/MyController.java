package com.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.User;
import com.service.UserService;
@Controller
public class MyController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")	
	public String registerPage(Model model) {
		model.addAttribute("title","Welcome Page" );
		return "register";
	}
	@GetMapping("/login")	
	public String loginPage(Model model) {
		model.addAttribute("title","LoginPage" );
		return "login";
	}
	@PostMapping("/doRegister")	
	public String registerUser( User dto,Model model) {
		boolean check=userService.insert(dto);
		if(check) {
			model.addAttribute("msg","Register Successfully" );
			return "login";
		}else {
		model.addAttribute("msg","Does not Register!!Error" );
		return "register";
		}
	}
		@PostMapping("/doLogin")	
		public String loginUser( User dto,Model model,HttpServletRequest request) {
			User check=userService.getByEmailAndName(dto);
			HttpSession session=request.getSession();
			session.setAttribute("name",dto.getName());
			session.setAttribute("email",dto.getEmail());
			if(check!=null) {
				model.addAttribute("msg1","Welcome Page" );
				model.addAttribute("msg2","Login Successfully" );
				model.addAttribute("msg3","Name:"+(String)session.getAttribute("name")+
				"Email:"+(String)session.getAttribute("email") );
				model.addAttribute("msg4","<a href='logout'>LogOut</a>" );
				model.addAttribute("msg5","<a href='views'>View</a>" );
				return "welcome";
			}else {
				model.addAttribute("msg","Does not Login!!Error" );
				return "login";
			}
		}
			@GetMapping("/logout")	
			public String logoutUser(HttpServletRequest request ) {
				HttpSession session=request.getSession();
				session.invalidate();
				return "login";
				
				}
			@GetMapping("/views")	
			public String getAllUsers(Model model) {
				model.addAttribute("msg","View Users");
				model.addAttribute("userList",userService.getAllUsers());
				return "view";
				
				}
			@GetMapping("/edit")
			 public String edit(@RequestParam("id") int id, Model model) {
					model.addAttribute("User",userService.getById(id));
					return "update";
				}
			 @PostMapping("/doUpdate")
			    public String updateUser(Model model ,User user ) {
				   boolean check= userService.updateUser(user);
				   if(check) {
					   model.addAttribute("msg","Sucessfully updated");
					   model.addAttribute("userList",userService.getAllUsers());
					   return"view";
				   }else{
					   model.addAttribute("msg","Does not  updated!!Error");
					   model.addAttribute("userList",userService.getAllUsers());
					   return"view";  
				   }
				   
			    }
			 @GetMapping("/delete")
				public String deleteJsp(@RequestParam("id") int id,Model model) {
					boolean check=userService.deleteUser(id);
					   if(check) {
						   model.addAttribute("msg","Sucessfully Deleted");
						   model.addAttribute("userList",userService.getAllUsers());
						   return"view";
					   }else{
						   model.addAttribute("msg","Does not  Deleted!!Error");
						   model.addAttribute("userList",userService.getAllUsers());
						   return"view";
					   }
				}
			} 
			
			
			
		