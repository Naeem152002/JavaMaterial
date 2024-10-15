package com.example.demo.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.response.ApiResponse;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(RuntimeException.class)
	public ApiResponse resourceNotFoundException(RuntimeException ex){
		String message=ex.getMessage();
		
		ApiResponse apiResponse=new ApiResponse(message,false);
		return apiResponse;
		
		
	}

}
