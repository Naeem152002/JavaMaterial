package com.byconcollandcollect2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List<Address>address;
	private List<String>ads;
	private Set<String>adr;
	private Set<Address>addr;
	private Map<String,String>questions;
	private Map<Question,Answer>qus;
	public Employee(int id, String name, List<Address> address, List<String> ads, Set<String> adr, Set<Address> addr,
			Map<String, String> questions, Map<Question, Answer> qus) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.ads = ads;
		this.adr = adr;
		this.addr = addr;
		this.questions = questions;
		this.qus = qus;
	}
	public Employee() {
		super();
	}
	
	public void show() {
		System.out.println(id+" "+name);
	
		Iterator<Address>it=address.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator<String>i=ads.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Iterator<String>s=adr.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		Iterator<Address>s1=addr.iterator();
		
		while(s1.hasNext()){
			System.out.println(s1.next());
			}
		Set<Entry<String,String>>set=questions.entrySet();
		Iterator<Entry<String,String>>se=set.iterator();
		
		while(se.hasNext()) {
			Entry<String,String>e=se.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		Set<Entry<Question,Answer>>q=qus.entrySet();
		Iterator<Entry<Question,Answer>>q1=q.iterator();
		
		while(q1.hasNext()) {
			Entry<Question,Answer>qu=q1.next();
			System.out.println(qu.getKey()+" "+qu.getValue());
		}
	}
	

}
