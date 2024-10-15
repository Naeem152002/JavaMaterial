
class Mythreadd extends Thread{
	public Mythreadd(String string) {
		super(string);
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().isDaemon());
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}}}}
	
	public class Test8 {

	public static void main(String[] args) {
		
		Mythreadd thread= new Mythreadd("child");
		thread.setDaemon(true);
		thread.start();
		for(int i=1;i<=5;i++)
		{
		
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}}
	}}