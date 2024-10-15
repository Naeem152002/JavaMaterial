package com.dependencysetter;

public class Employee {
	
	private String name;
	private Address adr;
	public void setName(String name) {
		this.name = name;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", adr=" + adr + "]";
	}

}
