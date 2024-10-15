// do synchronized method ek object per
class Table4{
	synchronized  public void printTable(int x) {
		for (int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(x*i);
		}
	}
		synchronized public void show(int x) {
			for (int i=1;i<=10;i++) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(x+i);
			}
		

		}}

class ThreadTestA1 extends Thread {
	Table4 t;
	public ThreadTestA1(Table4 t) {
		this.t=t;// TODO Auto-generated constructor stub
	}
public void run() {
	t.printTable(2);
}
}
class ThreadTestA2 extends Thread {
	Table4 t;
public ThreadTestA2(Table4 t) {
		this.t=t;// TODO Auto-generated constructor stub
	}
public void run() {
	t.show(9);
}

}
public class SynchronizedDemo4 {
	public static void main(String args[]) {
Table4 obj=new Table4();
ThreadTestA1 t1=new ThreadTestA1(obj);
ThreadTestA2 t2=new ThreadTestA2(obj);
t1.start();
t2.start();
}}