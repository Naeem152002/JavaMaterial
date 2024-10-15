package com.dto;

import lombok.Data;

@Data
public class Employee {
	public Employee(String name, String email, String mobile, String password) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	public Employee() {
		super();
	}
	private int id;
	private String name,email,mobile,password;
	public Employee(String name, String email) {
		this.name = name;
		this.email = email;
	}

}
