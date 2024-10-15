// do synchronized method do object per 
class Table5{
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

class ThreadTestA11 extends Thread {
	Table5 t;
	public ThreadTestA11(Table5 t) {
		this.t=t;// TODO Auto-generated constructor stub
	}
public void run() {
	t.printTable(2);
}
}
class ThreadTestA21 extends Thread {
	Table5 t;
public ThreadTestA21(Table5 t) {
		this.t=t;// TODO Auto-generated constructor stub
	}
public void run() {
	t.show(9);
}

}
public class SynchronizedDemo5 {
	public static void main(String args[]) {
Table5 obj1=new Table5();
Table5 obj2=new Table5();
ThreadTestA11 t1=new ThreadTestA11(obj1);
ThreadTestA21 t2=new ThreadTestA21(obj2);
t1.start();
t2.start();
}}
