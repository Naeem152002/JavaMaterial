package com.compratorandcomprable;

import java.util.TreeSet;

public class TestImp 
{

	public static void main(String[] args) {
		
		Emp emp1=new Emp(104,"ram","suryaGlobal");
		Emp emp2=new Emp(101,"ashaym","suryaGlobal");
		Emp emp3=new Emp(102,"mohan","abcd");
		Emp emp4=new Emp(103,"ajesh","xyz");
		
		TreeSet treeSet=new TreeSet<>();//tree extend krta hain comprable ko 
	
		
		treeSet.add(emp1);
		treeSet.add(emp2);
	    treeSet.add(emp3);	
		treeSet.add(emp4);
		
		System.out.println(treeSet);
		
		
	}
	

}
