package com.androjava.dto;

public class UserDto {
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	private String name,email,password,mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public UserDto(String name, String email, String password, String mobile) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	public UserDto(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
