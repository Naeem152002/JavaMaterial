public class Test4 extends Thread {

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
		
	Test4 t=new Test4();
	t.setName("one");// ye one name dega thread ka nahi doge to jvm zero dega
	t.start();
	
	Test4 t1=new Test4();
	t1.setName("two");//
	t1.start(); 
}

}