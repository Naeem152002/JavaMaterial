
public class Test extends    Thread {// thread ke andar ka task likh sake
	
	public void run() {
		System.out.println("thread chalja");
	}
	
 public static void main(String args[]) {
	Test t=new Test();
	t.start();
}
}
