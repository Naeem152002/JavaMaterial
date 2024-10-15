package com.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController
{


	@Override
	protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response) throws Exception {
		
		
		
		ModelAndView modelAndView=new ModelAndView("abcd");
		
		modelAndView.addObject("welcomemessage","hello how are your...");
		
		return modelAndView;
	
		 
	}

	
	
}
