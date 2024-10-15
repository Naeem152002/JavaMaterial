package com.dibycon;

public class Employee {
	private int id;
	private String name;
	private String address;
	public Employee() {		
}

	public Employee(int id, String name,String address) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
	}
	public void show() {
		System.out.println(id+" "+name+" "+address);
	}

}
