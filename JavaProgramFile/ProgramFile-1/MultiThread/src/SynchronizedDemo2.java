//Static bana lete hai:interfare nahi karega ye bhi mutual exclusive hai 
class Table2{
	synchronized static public void printTable(int x) {
		for (int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(x*i);
		}
	}}
class MyThreadd12 implements Runnable{
	Table2 t;
	public MyThreadd12(Table2 t) {
		this.t=t;
	}
	@Override
	public void run() {
	Table2.printTable(2);
	}
	
}
class MyThreadd22 implements Runnable{
	Table2 t;
	public MyThreadd22(Table2 t) {
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Table2.printTable(4);	
	}
	
}
class MyThreadd32 implements Runnable{
	Table2 g;
	public MyThreadd32(Table2 g) {
		this.g=g;
	}
	@Override
	public void run() {
		Table2.printTable(6);
	}
	
}
class MyThread42 implements Runnable{
	Table2 g;
	public MyThread42(Table2 g) {
		this.g=g;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		g.printTable(8);
	}
	
}
public class SynchronizedDemo2 {

	public static void main(String[] args) {
		Table2 t=new Table2();
		Table2 g=new Table2();
		
		MyThreadd12 t1=new MyThreadd12(t);
		Thread tt1=new Thread(t1,"one");
		
		MyThreadd22 t2=new MyThreadd22(t);
		Thread tt2=new Thread(t2,"two");
		
		MyThreadd32 t3=new MyThreadd32(g);
		Thread tt3=new Thread(t3,"three");
		
		MyThread42 t4=new MyThread42(g);
		Thread tt4=new Thread(t4,"four");
		
		
	tt1.start();
		
	tt2.start();	
	tt3.start();	
	tt4.start();	
		
		
	}
		// TODO Auto-generated method stub

	}




