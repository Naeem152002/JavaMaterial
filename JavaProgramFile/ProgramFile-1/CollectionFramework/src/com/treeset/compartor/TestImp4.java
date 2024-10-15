package com.treeset.compartor;

import java.util.Comparator;
import java.util.TreeSet;

public class TestImp4 
{

	public static void main(String[] args) {
		
		Emp4 emp1=new Emp4(101,"ram","suryaGlobal");
		Emp4 emp2=new Emp4(101,"shaym","suryaGlobal");
		Emp4 emp3=new Emp4(102,"mohan","abcd");
		Emp4 emp4=new Emp4(103,"rajesh","xyz");
		
		Comparator comparator=new NameComp();
		Comparator comparator1=new IdComp();
		
		
		TreeSet treeSet=new TreeSet(comparator);
	
		
		treeSet.add(emp1);
		treeSet.add(emp2);
	    treeSet.add(emp3);	
		treeSet.add(emp4);
		
		System.out.println(treeSet);
		
		
	}
	

}

