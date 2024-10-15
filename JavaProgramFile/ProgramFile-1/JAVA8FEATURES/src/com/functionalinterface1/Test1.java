//with anonymous class
package com.functionalinterface1;


@FunctionalInterface
interface Funct
{
void show();
}

public class Test1 
{	 
	public static void main(String[] args) {		 
		Funct d=new Funct()
		{
			@Override
			public void show() {
				 System.out.println("show of Test");		
			}			
		};
		d.show();
	}

	
	
}

