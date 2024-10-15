package ecp;
import java.util.Scanner;
public class Test3 {
public static void main(String arg[]) {
	int i=0,j=0;
	try {
		String s1=null;
		System.out.println(s1.length());
	Scanner s=new Scanner (System.in);
	System.out.println("enter first number");
	i=s.nextInt();// apna charcater dala input to hume ek parent exception band lena chayie 
	System.out.println("enter second number");
	j=s.nextInt();
	int z=i+j;
	System.out.println(z);
	int z1=i-j;
	System.out.println(z1);
	int z2=i/j;
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
	catch(Exception r) {
		// System.out.println("r");// ye humne banaya hai
		System.out.println("parent excetption ");
	}
	int z3=i*j;
	System.out.println(z3);
	System.out.println("normal flow ");
	

}
}

