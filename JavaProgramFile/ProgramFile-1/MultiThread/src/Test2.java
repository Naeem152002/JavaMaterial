//Third tarika : Thread banane ke first
public class Test2 {
  public static void main(String rgs []) {
	 Runnable r= new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("hi");
		}};
		new Thread(r).start();
  }
}
