package com.functionalinterface.lambdaexpression1;
//second method

@FunctionalInterface
interface I
{
int add(int x,int y);
}


public class Test2 
{	 
	public static void main(String[] args) {
		 
		I d=(p,q)->p+q;
		System.out.println(d.add(34,45));
	
	}

	
}
