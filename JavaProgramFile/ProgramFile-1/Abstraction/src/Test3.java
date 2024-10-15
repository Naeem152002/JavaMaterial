
// first method :ya to app child class ko abstract banao ya fir ovveride kr do 
abstract class A {
abstract void show();
abstract void method ();
void disp() {
	System.out.println("disp ");
}
}
 public class Test3 extends A{

	@Override
	void show() {
		System.out.println("show of Test3");
		
	}

	@Override
	void method() {
		System.out.println("show of A Test3");
		
	}
	public static void main(String afsg[]) {
	//	A a;// abstract class ka  reference bana sakate hai object nahi bana sakte hai: first method refernce ke
	A t =new Test3();// isliye humne isme  child class ka object banya hai.       : ke liye 
	t.show();
	t.method();
	t.disp();
	
	}
	
}
