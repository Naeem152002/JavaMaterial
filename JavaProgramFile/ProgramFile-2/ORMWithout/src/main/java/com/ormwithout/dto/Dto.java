package com.ormwithout.dto;

public class Dto {
	private int id;
	private String name,address;

	public Dto() {
		
	}

	public Dto(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	}
		

