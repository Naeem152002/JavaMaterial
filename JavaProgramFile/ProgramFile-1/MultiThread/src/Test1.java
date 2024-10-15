class A implements Runnable{// Association

		@Override
		public void run() {
			// TODO Auto-generated method stub
		System.out.println("hello");	
		}
		
	}
	public class Test1 {
public static void main(String args[]) {
	 A a= new A();
	 Thread t = new Thread(a);
	 t.start();
	 
	 
}
}
