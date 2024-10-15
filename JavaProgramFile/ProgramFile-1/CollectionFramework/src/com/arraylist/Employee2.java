package com.arraylist;

public class Employee2 {

	
	String name,address;
	int id;
	Employee2(String name,String address,int id)
	{
		this.name = name;
		this.address = address;
		this.id = id;
		
	}
	
	public void show()
	{
		System.out.println(name+" "+address+" "+id);
	}

}


