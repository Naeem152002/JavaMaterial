package com.hashmap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestImp 
{

	public static void main(String[] args) {
		
		Emp emp1=new Emp(101,"ram","suryaGlobal");//yaha per naya object ban raha hain isliye yaha per duplicasy allow ho rahi hain  kyuki naye object
		//ke liye nayi hashcode id banegi isliye agar app chahate ki yaha per duplicassy allow na ho to apko hashcode ko bhi override krna padega 
		
		Emp emp2=new Emp(101,"shaym","suryaGlobal");
		Emp emp3=new Emp(102,"mohan","abcd");
		Emp emp4=new Emp(103,"rajesh","xyz");
		//yaha per object hain sabke liye ek nayi hashcode id genere hoti hain 
		//is hashcode ko buckets ke satah madular nikalenge to sabke liye alag madular ayega 
		//isliye jitane bhi object hain sabke liye alag alag index generate hoga 
		
		HashSet hashSet=new HashSet<>();
		
		hashSet.add(emp1);
		hashSet.add(emp2);
		hashSet.add(emp3);
		hashSet.add(emp4);
		
	java.util.Iterator i=hashSet.iterator();
	while(i.hasNext()) {
		
		System.out.println(i.next());
		
	}
	}}
	

