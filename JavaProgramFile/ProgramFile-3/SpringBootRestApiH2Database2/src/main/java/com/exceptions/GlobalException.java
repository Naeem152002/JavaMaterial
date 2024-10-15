package com.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.response.ApiResponse;

@RestControllerAdvice
public class GlobalException {
	
//	@ExceptionHandler(NoSuchElementException.class)
//	public ResponseEntity<List<String>>handleException(NoSuchElementException ex){
//	List<String>resp=new ArrayList<String>();
//		String message=ex.getMessage();
//		resp.add(message);
//		return new ResponseEntity<List<String>>(resp,HttpStatus.BAD_REQUEST);
//	}
       @ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse>resourceNotFoundException(ResourceNotFoundException ex){
    	  String fieldName= ex.getMessage(); 
    	  ApiResponse apiResponse=new ApiResponse(fieldName,false);
    	  
    	  return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
		
	}
       @ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>>handleException(MethodArgumentNotValidException ex){
		
    	   Map<String, String>resp=new HashMap<String,String>();
    	   ex.getBindingResult().getAllErrors().forEach(error->{;
    	   String fieldName=((FieldError) error).getField();
    	   String message=error.getDefaultMessage();
    	   resp.put(fieldName, message);
    	   });
    	   
    	   return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
	}
}
