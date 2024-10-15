package com.comprable1;
public class Student implements Comparable{
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	int id;
	String name,address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int id1=this.id;
		Student student=(Student)o;
		int id2=student.id;
		if (id1<id2) {
			return 1;
		}else if(id1>id2) {
			return -1;
		}else
		return 0;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
