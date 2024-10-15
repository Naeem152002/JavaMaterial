package com.fifthhibernaewithjsp.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
public class User {
	private int id;
	private String name,email,password,mobile;
public User(String name, String email, String password, String mobile) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
public User(){
	
}

}
