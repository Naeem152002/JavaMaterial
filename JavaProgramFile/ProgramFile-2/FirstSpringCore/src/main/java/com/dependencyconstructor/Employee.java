package com.dependencyconstructor;

public class Employee {
	
	private String name;
	
	private Address add;
	public Employee(String name, Address add) {
		super();
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", add=" + add + "]";
	}

}
