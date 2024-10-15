// Case:agar apne exit kr diya to nahi chalega 
package ecp;

public  class Test15{
	public static void main(String arg[]) {
	try {

		System.out.println("try");
		int x=10/0;
	}
	catch (Exception e) {
		System.out.println("catch");
		System.exit(0);//jvm shutdowns
	}
	finally {
		System.out.println("finally");
	}
	}
}


