//Method:first approach 
package com.treeset;
public class Emp3 implements Comparable {
	
	
	private int id;
	public Emp3(int id, String name, String cmpName) {
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
//	@Override
//	public int compareTo(Object o) 
//	{
//		Emp3 e = (Emp3) o;
//		if(e.id>this.id)
//			return -1;
//		else if(e.id<this.id)
//		return 1;
//		else
//		return 0;	
//			
//	}
@Override
public int compareTo(Object o) 
{
	Emp3 e = (Emp3) o;
	return e.name.compareTo(this.name);

}}
	//ye logic likhana padega agar user defind class ko 
//use krna kyuki comparble se jo implements krti hain 
//wo usi ki use krta hain
