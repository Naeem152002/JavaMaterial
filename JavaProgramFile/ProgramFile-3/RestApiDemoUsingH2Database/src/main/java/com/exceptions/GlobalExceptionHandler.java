package com.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	 @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<?> handleValidationExceptions(MethodArgumentNotValidException ex) {
	        BindingResult result = ex.getBindingResult();
	        StringBuilder errorMessage = new StringBuilder();
	        for (FieldError fieldError : result.getFieldErrors()) {
	            errorMessage.append(fieldError.getDefaultMessage()).append("\n");
	        }
	        return ResponseEntity.badRequest().body(errorMessage.toString());
	    }
	
	 
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        // Handle generic exceptions
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + ex.getMessage()+"\n");
    }
}
