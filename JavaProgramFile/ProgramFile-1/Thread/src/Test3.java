public class Test3 extends Thread {

	public void run() {
		System.out.println("hi");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getName());//jvm thread ka name de deta hai
		
	Test3 t=new Test3();
	t.setName("one");// ye one name dega thread ka nahi doge to jvm zero dega
	t.start();
	
	Test3 t1=new Test3();
	t1.setName("two");//
	t1.start();
}
}
