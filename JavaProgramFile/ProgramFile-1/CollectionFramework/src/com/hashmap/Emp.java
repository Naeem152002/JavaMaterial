package com.hashmap;


public class Emp {
	
	
	private int id;
	public Emp(int id, String name, String cmpName) {
		super();
		this.id = id;
		this.name = name;
		this.cmpName = cmpName;
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
	public String getCmpName() {
		return cmpName;
	}
	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}
	private String name;
	private String cmpName;
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", cmpName=" + cmpName + "]";
	}
		
	
	
}
