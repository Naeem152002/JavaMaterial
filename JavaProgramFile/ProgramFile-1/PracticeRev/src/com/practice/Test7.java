package com.practice;

public class Test7 extends Thread {
	@Override
	public void run() {
		System.out.println("how are you");
		
	}
	
	public static void main(String args[]) {
		
		Test7 t=new Test7();
		t.start();
	}

}
