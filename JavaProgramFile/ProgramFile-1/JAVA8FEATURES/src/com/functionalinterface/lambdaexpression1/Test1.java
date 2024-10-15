package com.functionalinterface.lambdaexpression1;
//first method 

@FunctionalInterface
interface I1
{
int add(int x,int y);
}


public class Test1 
{	 
	public static void main(String[] args) {
		 
		I d=(int x, int y)-> {
				return x+y;
			};
		 
 
		System.out.println(d.add(34,45));
		
		I u=(x,y)->x+y;
		System.out.println(u.add(8, 9));
	
	}

	
}

