// run method normal method ki tarah behave kr sakata hai
public class Test5 extends Thread {
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}}
	}
	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getName());//jvm thread ka name de deta hai
		
	Test5 t=new Test5();
	t.setName("one");// ye one name dega thread ka nahi doge to jvm zero dega
	//t.start();
	t.run();
	
	Test5 t1=new Test5();
	t1.setName("two");//
	//t1.start(); 
	t1.run();
}
}
