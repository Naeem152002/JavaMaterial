//join method:isme third cons join kiya to ye last main chalega
class ThreadTesttt1 extends Thread{
	ThreadTesttt1(String name){
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
class ThreadTesttt2 extends Thread{
ThreadTesttt2(String name){
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
class ThreadTesttt3 extends Thread{
ThreadTesttt1 tt1;
ThreadTesttt2 tt2;	

ThreadTesttt3(String name,ThreadTesttt1 tt1,ThreadTesttt2 tt2){
	super(name);
	this.tt1=tt1;
	this.tt2=tt2;
}
	public void run() {
		
	try {
		tt1.join();
		tt2.join();
		
	}
	catch(InterruptedException e1) {
		e1.printStackTrace();
	}

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

public class Test7{
public static void main(String args []) {
	
	ThreadTesttt1 t1=new ThreadTesttt1("one");
	ThreadTesttt2 t2=new ThreadTesttt2("two");
	ThreadTesttt3 t3 =new ThreadTesttt3("Three",t1,t2);
	t1.start();
	t2.start();
	t3.start();	
	
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


