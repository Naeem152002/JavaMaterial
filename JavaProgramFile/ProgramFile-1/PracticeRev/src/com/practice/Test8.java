package com.practice;

public class Test8 {
	

	public static void main(String args[]) {
		Runnable r=new Runnable() {

			@Override
			public void run() {
				System.out.println("I am doing coding");
				
			}
			
		};
		Thread t=new Thread(r);
		t.start();
	}

}
