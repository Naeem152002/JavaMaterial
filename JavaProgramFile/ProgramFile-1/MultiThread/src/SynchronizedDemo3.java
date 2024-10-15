// block
class Table3{
	 static public void printTable(int x) {
		for (int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(x*i);
		}
	synchronized (Table3.class)	{
	System.out.println("jii");
	System.out.println("jid ");
	}}
}
class MyThreadd121 implements Runnable{
	Table3 t;
	public MyThreadd121(Table3 t) {
		this.t=t;
	}
	@Override
	public void run() {
	Table3.printTable(2);
	}
	
}
public class SynchronizedDemo3{
public static void main (String[] args) {
	Table3 t=new Table3();	
	MyThreadd121 t1=new MyThreadd121(t);
	Thread tt1=new Thread(t1,"one");
	tt1.start();
	
}}