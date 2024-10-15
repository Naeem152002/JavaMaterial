class X extends Thread{
	X(String s){
		super(s);
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Y extends Thread{
	Y(String y){
		super(y);
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ABCD {
	
	public static void main(String[]args) throws InterruptedException {
		X x1=new X("one");
		x1.start();
		Y y=new Y("two");
		y.start();
		
		
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	
		
	}

}
