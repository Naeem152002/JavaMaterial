package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController 
{


	@RequestMapping("/hello")
	protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response) throws Exception {
		
		ModelAndView modelAndView=new ModelAndView("abcd");
		
		modelAndView.addObject("welcomemessage","hello how are your...");
		
		return modelAndView;
	
		 
	}

	
	
}
