package com.onlineshoppingsystem.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onlineshoppingsystem.response.ApiResponse;

@RestControllerAdvice
public class GlobalHandlerExceptions {
	
	
	  @ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse>handlerException(ResourceNotFoundException ex){
		String message=ex.getMessage();
		
		return new ResponseEntity<ApiResponse>(new ApiResponse(message,false),HttpStatus.NOT_FOUND);
	}
	  @ExceptionHandler(OurException.class)
    public ResponseEntity<ApiResponse>ourException(OurException ex){
    	String message=ex.getMessage();
    	
    	ApiResponse apiResponse=new ApiResponse(message,false);
    	return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.BAD_REQUEST);
    }
	  @ExceptionHandler(AlreadyExistException.class)
	  public ResponseEntity<ApiResponse>alreadyExistException(AlreadyExistException ex){
		  String message=ex.getMessage();
		  
		  ApiResponse apiResponse=new ApiResponse(message,false);
		  return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.BAD_REQUEST);
	  }
	  @ExceptionHandler(BadCredentialsException.class)
	  public ResponseEntity<String>badCardentialsException(){
		  return new ResponseEntity<String>("Password is Wrong",HttpStatus.BAD_REQUEST);
	  }
	  @ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<Map<String,String>>handleException(MethodArgumentNotValidException ex){
	    	   Map<String,String>resp=new HashMap<>();
	    	   ex.getBindingResult().getAllErrors().forEach((error)->{
	    		   String fieldName = ((FieldError)error).getField();
	    		   String message=error.getDefaultMessage();
	    		   resp.put(fieldName, message);
	    		  
	    	   });   
			return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
		}
	
}
