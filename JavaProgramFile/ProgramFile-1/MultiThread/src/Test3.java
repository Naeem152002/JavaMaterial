//Third tarika : Thread banane ke second
public class Test3 {
  public static void main(String rgs []) {
	 
new Thread (new Runnable() {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hi"); 
	}
}).start();
	
}
		
}

