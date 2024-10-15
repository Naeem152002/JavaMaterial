package com.beanlifecyclethirdmethod;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class Employee 
{  
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adr=" + adr + "]";
	}

private int id;
private String name;
private Address adr;
public int getId() {
	return id;
}
public void setId(int id) {
	System.out.println("setter  started");
	this.id = id;
}
public Employee() {
	super();
	System.out.println("constructor started");
}
public Employee(int id, String name, Address adr) {
	super();
	this.id = id;
	this.name = name;
	this.adr = adr;
	System.out.println("constructor started");
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("setter started");
	this.name = name;
}
public Address getAdr() {
	return adr;
}
public void setAdr(Address adr) {
	System.out.println("setter started");
	this.adr = adr;
}
@PostConstruct
public void init() throws Exception
   {
       System.out.println(
           "Bean HelloWorld has been "
           + "instantiated and I'm "
           + "the init() method");
   }

   // This method executes
   // when the spring container
   // is closed
@PreDestroy
   public void destroy() throws Exception
   {
       System.out.println(
           "Container has been closed "
           + "and I'm the destroy() method");
   }
}

	
	
	


