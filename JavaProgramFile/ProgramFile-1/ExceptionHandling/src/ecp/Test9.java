package ecp;

public class Test9 {
public  static void main(String args[]) {
	try {
		System.out.println("oute tr1");
		//int x=10/0;
		try {
			System.out.println("inner tr1");
			int x=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("try 1");
		}
		try {
			System.out.println("inner tr2");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		 catch(Exception e) {
		System.out.println("parent exp");
		 }
		System.out.println("normal flow ");
}
}

