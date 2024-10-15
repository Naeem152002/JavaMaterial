package com.treeset;

import java.util.TreeSet;

public class TestImp3
{

	public static void main(String[] args) {
		
		Emp3 emp1=new Emp3(101,"ram","suryaGlobal");
		Emp3 emp2=new Emp3(101,"shaym","suryaGlobal");
		Emp3 emp3=new Emp3(102,"mohan","abcd");
		Emp3 emp4=new Emp3(103,"rajesh","xyz");
		
		
		TreeSet treeSet=new TreeSet();
	
		
		treeSet.add(emp1);
		treeSet.add(emp2);
	    treeSet.add(emp3);	
		treeSet.add(emp4);
		
		System.out.println(treeSet);
		
		
	}
	

}

