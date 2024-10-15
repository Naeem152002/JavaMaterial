package com.functionalinterface.lambdaexpression1;

@FunctionalInterface
interface I2
{
void add(int x,int y);
}


public class Test3 
{	 
	public static void main(String[] args) {
		 
		I2 d=(x,y)->System.out.println("sum="+(x+y));
		d.add(12, 33);
	
	}

	
}

