package com.practice;
class A extends Thread{
	A(String name){
	super(name);
	}
	@Override
	public void run() {
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
		System.out.println("A");
	}	
}
class B extends Thread{
	B(String name){
		super(name);
		}
	@Override
	public void run() {
		A a=new A("A-One");
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
class C extends Thread{
	C(String name){
		super(name);
		}
	@Override
	public void run() {
		System.out.println("C");
	}
}
class D extends Thread{
	D(String name){
		
		super(name);
		}
	@Override
	public void run() {
		C c=new C("C-Three");
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

public class Test3{
	public static void main(String[]args) throws InterruptedException {
		
		B b=new B("B-Two");
		D d=new D("D-Four");
		b.start();
		d.start();
		
		
	}

}
