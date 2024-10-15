 //Case1: override throws keyword first case
package ecp;
class A{
	void show() {//parent mai exception show nahi ho raha ho
		
	}
}
public class Test20 extends A {
	void show()throws ArithmeticException {// only valid unchecked exception
		
	}
public static void main(String ags[]) {
	
}
}
