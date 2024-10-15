package com.dependencyconstructor.collection;

import java.util.List;
import java.util.Map;

public class Employee {
	
	private String name;
	
	private Address adr;
	
	private List<String>ls;
	
	private Map<String, String>m;
	
	
	private List<Address>a;
	
	
	private Map<Question, Answer>qa;


	public Employee(String name, Address adr, List<String> ls, Map<String, String> m, List<Address> a,
			Map<Question, Answer> qa) {
		super();
		this.name = name;
		this.adr = adr;
		this.ls = ls;
		this.m = m;
		this.a = a;
		this.qa = qa;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", adr=" + adr + ", ls=" + ls + ", m=" + m + ", a=" + a + ", qa=" + qa + "]";
	}
	
	

	
	
	

}
