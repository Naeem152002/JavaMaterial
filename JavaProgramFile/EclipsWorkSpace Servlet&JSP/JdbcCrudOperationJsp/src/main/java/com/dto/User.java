package com.dto;
public class User {
	public User() {
		super();
	}
	public User(String name, String email, String password, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
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
	private String name,email,password,mobile;
	

}
