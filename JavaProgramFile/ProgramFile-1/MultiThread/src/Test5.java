//join method:isme kewal char thread chalenge one,two,three aur main wala
class ThreadTest1 extends Thread{
	ThreadTest1(String name){
		super(name);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"hi");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}}
	
	
		System.out.println(Thread.currentThread().getName()+"Dead");
	
}
}
class ThreadTest2 extends Thread{
ThreadTest2(String name){
	super(name);
}
public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println(Thread.currentThread().getName());
	try {
		Thread.sleep(1000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}}
	
	System.out.println(Thread.currentThread().getName()+"Dead");
}
}
class ThreadTest3 extends Thread{
ThreadTest3(String name){
	super(name);
}
public void run() {
	for(int i=1;i<=15;i++) {
		System.out.println(Thread.currentThread().getName());
	try {
		Thread.sleep(1000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}}


	System.out.println(Thread.currentThread().getName()+"Dead");
}

}

public class Test5 {
	
public static void main(String args []) throws InterruptedException {
	Thread.sleep(5000);
	ThreadTest1 t1=new ThreadTest1("one");
	ThreadTest2 t2=new ThreadTest2("two");
	ThreadTest3 t3 =new ThreadTest3("Three");
	t1.start(); 
	t2.start();
	t3.start();	
	
	for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread().getName()+"m");
		System.out.println("after 5 minutes");
	try {
		Thread.sleep(5000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}}


	System.out.println(Thread.currentThread().getName()+"Dead");

}
	
	
	
}