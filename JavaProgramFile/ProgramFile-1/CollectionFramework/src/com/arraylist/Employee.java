package com.arraylist;

public class Employee {

	
	String name,address;
	int id;
	Employee(String name,String address,int id)
	{
		this.name = name;
		this.address = address;
		this.id = id;
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", id=" + id + "]";
	}
}