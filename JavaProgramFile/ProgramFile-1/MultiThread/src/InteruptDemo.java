class MyThread extends Thread{
	public MyThread(String string) {
		super(string);
	}
	public void run() {
		try {
			System.out.println(Thread.currentThread());
			Thread.sleep(30000);
		}catch(InterruptedException e) {
			System.out.println("thread is feeling fresh working again.......");
		}
		System.out.println("hello");
	}
}
class MyThread6 extends Thread{
	MyThread t1;
	public MyThread6(String string,MyThread t1) {
		super(string);
		this.t1=t1;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			System.out.println("now first thread is joined......");
			t1.join(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println(t1.isInterrupted());
		t1.interrupt();
		//System.out.println(t1.isInterrupted());
	}
}
public class InteruptDemo {

	public static void main(String[] args) {
		MyThread t=new MyThread("one");
		MyThread6 t1=new MyThread6("two",t);
		t.start();
		t1.start();


	}

}
