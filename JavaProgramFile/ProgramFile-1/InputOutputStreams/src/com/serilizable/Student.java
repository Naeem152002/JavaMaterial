package com.serilizable;

import java.io.Serializable;

public class Student implements Serializable {
	private int age;
	private String name,email,address;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int age, String name, String email, String address) {
		this.age = age;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}