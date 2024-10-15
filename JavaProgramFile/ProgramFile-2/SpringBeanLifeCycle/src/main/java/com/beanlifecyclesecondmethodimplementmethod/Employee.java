package com.beanlifecyclesecondmethodimplementmethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean
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
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	 System.out.println(
        "Bean HelloWorld has been "
	        + "instantiated and I'm "
	        + "the init() method");
}
@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	  System.out.println(
	        "Container has been closed "
	        + "and I'm the destroy() method");
}

}
	
	
	


