package com.thread.practice;

public class Test4 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Excute-1");
	}
	
	public static void main(String[]args) {
		
		Test4 t=new Test4();
		Runtime runtime=Runtime.getRuntime();
		runtime.addShutdownHook(t);
		
		
	}

}
