package com.anonymousnestedclass;
public class Test2
{

	public static void main(String[] args) 
	{
		
		 
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				 System.out.println("show");
			}
		});
		thread.start();
	}
}
