package com.practice;
interface I{
	void show();
}

public class Test {
	public static void main(String[]args) {
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread Excute");
				
			}
		};
		I i=new I() {
			@Override
			public void show() {
				System.out.println("Thread anonymous");
				
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		
	}

}
