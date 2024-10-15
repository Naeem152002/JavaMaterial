//object or class dono aage peeche chalega 
class Table6{
	synchronized  public static void printTable(int x) {
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

class ThreadTestA12 extends Thread {
	Table6 t;
	public ThreadTestA12(Table6 t) {
		this.t=t;// TODO Auto-generated constructor stub
	}
public void run() {
	t.printTable(2);
}
}
class ThreadTestA22 extends Thread {
	Table6 t;
public ThreadTestA22(Table6 t) {
		this.t=t;// TODO Auto-generated constructor stub
	}
public void run() {
	Table6.printTable(9);
	//t.show(9);
}

}
public class SynchronizedDemo6{
	public static void main(String args[]) {
Table6 obj11=new Table6();
//Table6 obj21=new Table6();
ThreadTestA12 t1=new ThreadTestA12(obj11);
ThreadTestA22 t2=new ThreadTestA22(obj11);
t1.start();
t2.start();
}}

