package com.dto;
 
public class Emp {  
private int id;  
private String name;  
private float salary;  
//getters and setters  
public Emp(String name, float salary) {
	this.name = name;
	this.salary = salary;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
}  
