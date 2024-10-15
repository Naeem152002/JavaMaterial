// ek thread ke andar subkuch chal raha hai
public class Test6 extends Thread {
	public Test6(String string) {
		super(string);
	}

	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		//System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}}
	}
	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getName());//jvm thread ka name de deta hai
		
	Test6 t=new Test6("one");
	//t.setName("one");// ye one name dega thread ka nahi doge to jvm zero dega
	//t.start();
	t.run();
	
	Test6 t1=new Test6("two");
	//t1.setName("two");//
	//t1.start(); 
	t1.run();
}
}