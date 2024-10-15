package ecp;
import java.util.Scanner;
public class Test1 {
public static void main(String arg[]) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter first number");
	int i=s.nextInt();
	System.out.println("enter second number");
	int j=s.nextInt();
	int z=i+j;
	System.out.println(z);
	int z1=i-j;
	System.out.println(z1);
	try {
	int z2=i/j;// ek try ke saath kai catch block laga sakate ho ise fayada ye ki try ko jo jaroot hai wo catch 
	// kr lega
	System.out.println(z2);
	}
	catch(ArithmeticException  r)
	{
		System.out.println("ArithmeticException...");
	}
	catch(NullPointerException r) {
		System.out.println("NullPointerException");
	}
	catch (NumberFormatException r) {
		System.out.println("NumberFormatException");
	}
	catch (ArrayIndexOutOfBoundsException r) {
		System.out.println("ArrayIndexOutOfBoundsException");
	}

	int z3=i*j;
	System.out.println(z3);
	System.out.println("normal flow ");
	
}
}
