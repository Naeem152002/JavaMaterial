package com.thread.practice;



class A extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			try {
				B.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("excute 1");
	}
	}
}
class B extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("excute-2");
	}
	}
}
public class Test1 {
	public static void main(String[]args) {
		A a=new A();
		B b=new B();
		a.start();
		b.start();
		
	}

}