//join method:join kiya hai main method mai to main method last main chalega 
class ThreadTestt1 extends Thread{
	ThreadTestt1(String name){
		super(name);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
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
class ThreadTestt2 extends Thread{
ThreadTestt2(String name){
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
class ThreadTestt3 extends Thread{
ThreadTestt3(String name){
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

public class Test6 {
	
public static void main(String args []) {
	
	ThreadTestt1 t1=new ThreadTestt1("one");
	ThreadTestt2 t2=new ThreadTestt2("two");
	ThreadTestt3 t3 =new ThreadTestt3("Three");
	t1.start();
	t2.start();
	t3.start();	
	try {
		t1.join();
		t2.join();
		t3.join();
	}
	catch(InterruptedException e1) {
		e1.printStackTrace();
	}
	for(int i=1;i<=5;i++) {
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

