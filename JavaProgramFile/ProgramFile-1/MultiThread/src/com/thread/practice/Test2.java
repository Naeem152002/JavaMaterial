package com.thread.practice;


public class Test2 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Excute thread");
	}
public static void main(String[]args) {
	System.out.println(Thread.currentThread().isDaemon());
		
		Test2 t=new Test2();
		t.setDaemon(true);
		t.start();
		
		
	}

}
