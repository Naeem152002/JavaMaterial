      /*isme jo bhi thread chlega poora chalega uske baad dusra chalega synchronized hata diya to randomly chalega hai
 * mutulal exclusive kahate hai
 */
class Table{
	synchronized public void printTable(int x) {
		for (int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(x*i);
		}
	}}
class MyThread1 implements Runnable{
	Table t;
	public MyThread1(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(2);
	}
	
}
class MyThread2 implements Runnable{
	Table t;
	public MyThread2(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(3);
	}
	
}
class MyThread3 implements Runnable{
	Table t;
	public MyThread3(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(6);
	}
	
}

public class SynchronizeDemo {

	public static void main(String[] args) {
		Table t=new Table();
		MyThread1 t1=new MyThread1(t);
		Thread tt1=new Thread(t1,"one");
		
		MyThread2 t2=new MyThread2(t);
		Thread tt2=new Thread(t2,"two");
		
		MyThread3 t3=new MyThread3(t);
		Thread tt3=new Thread(t3,"three");
		
		
	tt1.start();
		
	tt2.start();	
	tt3.start();	
		
		
		
	}
		// TODO Auto-generated method stub

	}


