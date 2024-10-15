//without anonymous
package com.functionalinterface1;
@FunctionalInterface
interface Demo
{
void show();
default void disp() 
{	
System.out.println("disp");	
}

static void disp1() 
{	
System.out.println("disp1");	
}
}
@FunctionalInterface
interface Demo1 extends Demo
{ 
	
}

public class Test implements Demo1
{
	@Override
	public void show() { 
		System.out.println("show of test class");
		
	}
	public static void main(String[] args) {
		Demo demo=new Test();
		demo.show();
		demo.disp();
		Demo.disp1();
	}

	

	
	
}
