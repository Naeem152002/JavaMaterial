package com.thread.practice;

class Table1{
	public synchronized void printTable(int x) {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class P1 implements Runnable{
	Table1 t;
	P1(Table1 t){
	this.t=t;
	}

	@Override
	public void run() {
		t.printTable(2);
		
	}
	
}
class Q1 implements Runnable{
	
	Table1 t;
	Q1(Table1 t){
	this.t=t;
	}
	
	@Override
	public void run() {
		t.printTable(4);
		
	}
	
}
class R1 implements Runnable{
	Table1 t;
	R1(Table1 t){
		this.t=t;
	}
	
	@Override
	public void run() {
		t.printTable(4);
		
	}
	
}


public class Test7 {
	public static void main(String[]args) {
		Table1 t=new Table1();
		
		P1 p=new P1(t);
		Q1 q=new Q1(t);
		R1 r=new R1(t);
		
		Thread t1=new Thread(p,"First");
		t1.start();
		Thread t2=new Thread(q,"Second");
		t2.start();
		Thread t3=new Thread(r,"Third");
		t3.start();
		
	}

}
