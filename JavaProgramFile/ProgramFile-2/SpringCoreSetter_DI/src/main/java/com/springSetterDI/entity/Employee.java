package com.springSetterDI.entity;

public class Employee {
	
	private int id;
	private String name;
	private Address addres;
	
	// Setter DI other Default DI is constuction 
	
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
	public Address getAddres() {
		return addres;
	}
	public void setAddres(Address addres) {
		this.addres = addres;
	}
	
	
	
	

}
