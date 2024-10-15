package com.thread.practice;

class Table{
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

class P implements Runnable{
	Table t;
	P(Table t){
	this.t=t;
	}

	@Override
	public void run() {
		t.printTable(2);
		
	}
	
}
class Q implements Runnable{
	
	Table t;
	Q(Table t){
	this.t=t;
	}
	
	@Override
	public void run() {
		t.printTable(4);
		
	}
	
}
class R implements Runnable{
	Table t;
	R(Table t){
		this.t=t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Test6 {
	public static void main(String[]args) {
		Table t=new Table();
		
		P p=new P(t);
		Q q=new Q(t);
		R r=new R(t);
		
		Thread t1=new Thread(p,"First");
		t1.start();
		Thread t2=new Thread(q,"Second");
		t2.start();
		Thread t3=new Thread(r,"Third");
		t3.start();
		
	}

}
