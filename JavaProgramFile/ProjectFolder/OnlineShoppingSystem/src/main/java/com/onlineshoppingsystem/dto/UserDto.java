package com.onlineshoppingsystem.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.onlineshoppingsystem.model.Cart;
import com.onlineshoppingsystem.model.Order;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
	 
	    private Long id;

	    
	    private String email;

	    
	    private String name;

	    
	    private String phoneNumber;

	    
	    private String password;

	    private String role;

	   
	    private Cart cart;

	    
	    private List<Order> order;
}
