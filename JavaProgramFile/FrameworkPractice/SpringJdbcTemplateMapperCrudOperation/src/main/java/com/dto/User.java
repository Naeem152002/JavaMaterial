package com.dto;

import lombok.Data;

@Data
public class User {
	public User() {
		super();
	}
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		
	}
	private int id;
	private String name,email,password,mobile;

}
