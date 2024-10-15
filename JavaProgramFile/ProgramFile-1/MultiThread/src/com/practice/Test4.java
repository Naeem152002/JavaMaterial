package com.practice;
class A1 extends Thread{
	A1(String name){
	super(name);
	}
	@Override
	public void run() {
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
		System.out.println("A");
	}	
}
class B1 extends Thread{
	B1(String name){
		super(name);
		}
	@Override
	public void run() {
		A1 a=new A1("A-One");
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
		System.out.println("B");
	}
}
class C1 extends Thread{
	C1(String name){
		super(name);
		}
	@Override
	public void run() {
		B1 b=new B1("B-Two");
		b.start();
		try {
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("C");
	}
}
class D1 extends Thread{
	D1(String name){
		
		super(name);
		}
	@Override
	public void run() {
		C1 c=new C1("C-Three");
		c.start();
		try {
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("D");
	}	
}

public class Test4{
	public static void main(String[]args) throws InterruptedException {
		
		D1 d=new D1("D-Four");
		d.start();
		
		
	}

}
