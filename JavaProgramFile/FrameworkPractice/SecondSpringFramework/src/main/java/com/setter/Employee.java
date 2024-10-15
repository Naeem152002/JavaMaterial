package com.setter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List<String>address;
	private List<Address>addres;
	private Set<String>addr;
	private Set<Address>add;
	private Map<String,String>quAs;
	private Map<Question,Answer>qa;
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
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public List<Address> getAddres() {
		return addres;
	}
	public void setAddres(List<Address> addres) {
		this.addres = addres;
	}
	public Set<String> getAddr() {
		return addr;
	}
	public void setAddr(Set<String> addr) {
		this.addr = addr;
	}
	public Set<Address> getAdd() {
		return add;
	}
	public void setAdd(Set<Address> add) {
		this.add = add;
	}
	public Map<String, String> getQuAs() {
		return quAs;
	}
	public void setQuAs(Map<String, String> quAs) {
		this.quAs = quAs;
	}
	public Map<Question, Answer> getQa() {
		return qa;
	}
	public void setQa(Map<Question, Answer> qa) {
		this.qa = qa;
	}
	public void show() {
		System.out.println(id+" "+name);
		Iterator<String>it=address.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
	}
		Iterator<Address>it1=addres.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		Iterator<String>s=addr.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		Iterator<Address>s1=add.iterator();
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		Set<Entry<String,String>>ma=quAs.entrySet();
		Iterator<Entry<String,String>>m1=ma.iterator();
		while(m1.hasNext()) {
			Entry<String,String>en=m1.next();
			System.out.println(en.getKey()+" "+en.getValue());
		}
		Set<Entry<Question,Answer>>q=qa.entrySet();
		Iterator<Entry<Question, Answer>>q1=q.iterator();
		
		while(q1.hasNext()) {
			Entry<Question,Answer>er=q1.next();
			System.out.println(er.getKey()+" "+er.getValue());
		}
	}
	
	

}
