package com.lambdaexpression;

public class Test3 {
	public static void main(String[]args) {
		
		Runnable r=new Runnable() {

			@Override
			public void run() {
				System.out.println("runnabl is thread ");
				
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		Runnable r1=()->{
			System.out.println("runnable323 is thread ");
			
		};
		Thread t1=new Thread(r1);
		t1.start();
		
	}
}
