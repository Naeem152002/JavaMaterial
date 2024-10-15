package com.compratorandcomprable;


import java.util.Comparator;

public class NameComp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
	 Emp emp1=(Emp)o1;
	 Emp emp2=(Emp)o2;
		return emp1.getName().compareTo(emp2.getName());
	//ye compare to string ka method hain
	}

}
