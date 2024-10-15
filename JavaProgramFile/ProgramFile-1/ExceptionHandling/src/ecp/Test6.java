package ecp;
import java.util.Scanner;
public class Test6 {
public static void main(String arg[]) {
	int i=0,j=0;
	try {
	Scanner s=new Scanner (System.in);
	System.out.println("enter first number");
	i=s.nextInt();
	System.out.println("enter second number");
	j=s.nextInt();
	int z=i+j;
	System.out.println(z);
	int z1=i-j;
	System.out.println(z1);
	int z2=i/j;
	System.out.println(z2);
	}
	catch(ArithmeticException | NullPointerException |NumberFormatException r) {// java8 se ek rul aya 
			System.out.println(r);
	}
	int z3=i*j;
	System.out.println(z3);
	System.out.println("normal flow ");
	

}
}
