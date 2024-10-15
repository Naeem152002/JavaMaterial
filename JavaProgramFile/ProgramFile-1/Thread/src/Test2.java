public class Test2 {
static {
	Thread t=Thread.currentThread();
	System.out.println("Name of thread static block"+t.getName());
}
public static void main(String arsg[]) {
	Thread t=Thread.currentThread();
	
	System.out.println("Name of thread is main block"+t.getName());
	System.out.println(Thread.currentThread().getName());
	System.out.println(t.getPriority());
	t.setName("surya thread");
	t.setPriority(7);
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Name of thread is main method"+t.getName());
	System.out.println(t.getName());
	
	}

}