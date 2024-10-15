//Third tarika : Thread banane ke third
public class Test4{
  public static void main(String rgs []) {
	Thread t =new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("hi");
		}
		
	});
	t.start();
  }
}


