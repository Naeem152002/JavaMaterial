// case3:agar exception galat de diya to bhi finally chalega 
package ecp;

public class Test14{
		public static void main(String arg[]) {
		try {
	
			System.out.println("try");
		}
		catch (NullPointerException  e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}
		}
	}



