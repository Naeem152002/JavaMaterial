package com.onlineshoppingsystem.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;


import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

	    private String message;
	    private String token;
	    private String role;
	    private String username;
	    private String expirationTime;

	    private UserDto user;
	    private ProductDto product;
	    private CategoryDto category;
	    private CartDto cart;
	    private CartItemDto cartItem;
	    private OrderDto order;
	    private OrderItemDto orderItem;
	    private ImageDto image;
	    private List<UserDto> userList;
	    private List<ProductDto> productList;
	    private List<CategoryDto> categoryList;
	    private List<CartDto> cartList;
	    private List<CartItemDto> cartItemList;
	    private List<OrderDto> orderList;
	    private List<OrderItemDto> orderItemList;
	    private List<ImageDto> imageList;
	
}
