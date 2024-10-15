abstract class B {
abstract void show();
abstract void method ();
void disp() {
	System.out.println("disp ");
}
}
 public class Test4 extends B{

	@Override
	void show() {
		System.out.println("show of Test4");
		
	}

	@Override
	void method() {
		System.out.println("show of A Test4");
		
	}
	public static void main(String afsg[]) {
	B t =new Test4();// upcasting :yah per up casting kr di hai : seccond method hai 
	t.show();
	t.method();
	t.disp();
	}
	
}
