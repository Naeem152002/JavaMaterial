package com.firstspringboot.mycontrollet;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/myapp")
public class MyContoller {

	@RequestMapping("/how")
	public  ModelAndView hi()  {
		
		System.out.println("hi");
		
		ModelAndView modelAndView=new ModelAndView("abcd");
		
		modelAndView.addObject("welcomemessage","hello how are your...");
		
		return modelAndView;
	
	}
}

