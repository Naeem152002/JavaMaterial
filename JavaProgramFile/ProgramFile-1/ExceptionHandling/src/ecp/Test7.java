// multiple try catch
package ecp;

public class Test7 {
	public static void main(String arg[]) {
		try {
			int x=10/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int x[]=new int[12];
			x[15]=34;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			String s=null;
			s.length();
		}catch(Exception e) {
			System.out.println(e);}
		}
	

}
