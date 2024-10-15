package com.functionalinterface.lambdaexpression1;
@FunctionalInterface
interface Demo
{
void show();
}


public class Test 
{	 
	public static void main(String[] args) {
		 
		Demo d=()->System.out.println("hi"); 
		d.show();
		
		Demo d1=()->{
			System.out.println("how are you");
		};
		d1.show();
	
	}

	
}
