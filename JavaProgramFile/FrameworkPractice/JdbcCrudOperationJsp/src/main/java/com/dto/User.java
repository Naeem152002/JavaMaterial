package com.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
	private int id;
	String name,email,password,mobile;
	public User(String name, String email, String password, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}

}
