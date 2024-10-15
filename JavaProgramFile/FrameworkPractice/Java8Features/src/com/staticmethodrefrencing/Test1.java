package com.staticmethodrefrencing;
class C{
	public static  void show() {
		System.out.println("show thread");
	}
}

public class Test1 {
	
	public static void main(String[]args) {
		
		Thread t=new Thread(C::show);
		t.start();
		
		
		Runnable r1=C::show;
		Thread t2=new Thread(r1);
		t2.start();
		
		
	}

}
