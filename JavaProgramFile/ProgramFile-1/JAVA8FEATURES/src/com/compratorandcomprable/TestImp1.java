package com.compratorandcomprable;

import java.util.Comparator;
import java.util.TreeSet;

public class TestImp1 
{

	public static void main(String[] args) {
		
		Emp emp1=new Emp(101,"ram","suryaGlobal");
		Emp emp2=new Emp(101,"shaym","suryaGlobal");
		Emp emp3=new Emp(102,"mohan","abcd");
		Emp emp4=new Emp(103,"rajesh","xyz");
		
		Comparator comparator=new NameComp();
		
		
		
		TreeSet treeSet=new TreeSet(comparator);
	
		
		treeSet.add(emp1);
		treeSet.add(emp2);
	    treeSet.add(emp3);	
		treeSet.add(emp4);
		
		System.out.println(treeSet);
		
		
	}
	

}

