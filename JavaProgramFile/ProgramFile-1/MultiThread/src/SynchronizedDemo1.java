/* humne 4 thread banaye hai aur jisme do object banye hai first second intefare nahi karega aur third fourth 
 * interfare nahi krega interfare first third,fourth krega aur second third fourth karega ye matual exculsive*/
class Table1{
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
class MyThreadd1 implements Runnable{
	Table1 t;
	public MyThreadd1(Table1 t) {
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(2);
	}
	
}
class MyThreadd2 implements Runnable{
	Table1 t;
	public MyThreadd2(Table1 t) {
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(3);
	}
	
}
class MyThreadd3 implements Runnable{
	Table1 g;
	public MyThreadd3(Table1 g) {
		this.g=g;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		g.printTable(6);
	}
	
}
class MyThread4 implements Runnable{
	Table1 g;
	public MyThread4(Table1 g) {
		this.g=g;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		g.printTable(8);
	}
	
}
public class SynchronizedDemo1 {

	public static void main(String[] args) {
		Table1 t=new Table1();
		Table1 g=new Table1();
		
		MyThreadd1 t1=new MyThreadd1(t);
		Thread tt1=new Thread(t1,"one");
		
		MyThreadd2 t2=new MyThreadd2(t);
		Thread tt2=new Thread(t2,"two");
		
		MyThreadd3 t3=new MyThreadd3(g);
		Thread tt3=new Thread(t3,"three");
		
		MyThread4 t4=new MyThread4(g);
		Thread tt4=new Thread(t4,"four");
		
		
	tt1.start();
		
	tt2.start();	
	tt3.start();	
	tt4.start();	
		
		
	}
		

	}



