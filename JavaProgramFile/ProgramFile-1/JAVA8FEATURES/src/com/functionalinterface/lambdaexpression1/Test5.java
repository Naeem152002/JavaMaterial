
package com.functionalinterface.lambdaexpression1;

public class Test5
	{	 
		public static void main(String[] args) {
			 
Runnable r=()->System.out.println("hello");
	      Thread thread=new Thread(r);
	      thread.start();
		
		}

		
	}







