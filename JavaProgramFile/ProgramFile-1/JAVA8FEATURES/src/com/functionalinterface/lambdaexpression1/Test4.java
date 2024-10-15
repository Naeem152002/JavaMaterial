
package com.functionalinterface.lambdaexpression1;

@FunctionalInterface
interface I3
{
int add(int x);
}


public class Test4 
{	 
	public static void main(String[] args) {
		 
		I3 d=x->x*x;
		System.out.println("sum="+d.add(4));
	
	}

	
}

