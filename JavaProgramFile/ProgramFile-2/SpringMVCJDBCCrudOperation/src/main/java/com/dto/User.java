package com.dto;

import lombok.Data;

@Data
public class User {
	private int id;
	private String name,email,password,mobile;
	public User() {
		
	}

}
