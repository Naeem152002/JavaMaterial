package com.hashmap.overridehashcode;
import java.util.HashSet;

public class TestImp1 
{

	public static void main(String[] args) {
		
		Emp1 emp1=new Emp1(101,"ram","suryaGlobal");
		//ke liye nayi hashcode id banegi isliye agar app chahate ki yaha per duplicassy allow na ho to apko hashcode ko bhi override krna padega 
		
		Emp1 emp2=new Emp1(101,"shaym","suryaGlobal");
		Emp1 emp3=new Emp1(102,"mohan","abcd");
		Emp1 emp4=new Emp1(103,"rajesh","xyz");
		
		HashSet hashSet=new HashSet<>();
	
		hashSet.add(emp1);
		hashSet.add(emp2);
		hashSet.add(emp3);
		hashSet.add(emp4);
		
		java.util.Iterator i=hashSet.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
			
		}
		
		
	}
	

}

