// Nested try:try ke andar try usi ko nested try kahate
package ecp;

public class Test8 {
public  static void main(String args[]) {
	try {
		System.out.println("oute tr1");
		int x=10/0;
		try {
			//int x=10/0;
			System.out.println("inner tr1");
		}
		catch(Exception e) {
			e.printStackTrace();
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
