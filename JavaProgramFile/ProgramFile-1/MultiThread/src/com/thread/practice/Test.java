package com.thread.practice;

public class Test {
	
	public static void main(String[]args) {
		
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=3;i++) {
				System.out.println("Thread excute-1");
				}
			}
			
		};
		Runnable r2=new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=3;i++) {
					System.out.println("Thread excute-2");
					}
				
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		Thread t2=new Thread(r2);
		t2.start();
		
		
	}

}
