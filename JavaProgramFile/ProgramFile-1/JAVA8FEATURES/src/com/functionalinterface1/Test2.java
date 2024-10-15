//with anonymous and implements class pass object in  interface 
package com.functionalinterface1;



public class Test2 
{	 
	public static void main(String[] args) 
	{		 

	Thread t=new Thread(new Runnable() {
		
		@Override
		public void run() {
			 System.out.println("show");
		}
	});
	t.start();
	}

	
	
}

