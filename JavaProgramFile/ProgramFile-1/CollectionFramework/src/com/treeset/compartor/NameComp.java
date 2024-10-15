package com.treeset.compartor;


import java.util.Comparator;

public class NameComp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
	 Emp4 emp1=(Emp4)o1;
	 Emp4 emp2=(Emp4)o2;
		return emp1.getName().compareTo(emp2.getName());
	}

}
