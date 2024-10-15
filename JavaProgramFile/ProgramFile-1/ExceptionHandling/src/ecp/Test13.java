//case2:agar exp ayega to bhi chalega finallly 
package ecp;

public class Test13 {
		public static void main(String arg[]) {
		try {
	
			System.out.println("try");
			int x=10/0;
		}
		catch (Exception e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}
		}
	}


