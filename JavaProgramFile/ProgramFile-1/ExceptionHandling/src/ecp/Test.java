package ecp;
import java.util.Scanner;
public class Test {
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
	int z2=i/j;// arthmatic exception a jayega 
	System.out.println(z2);
	}
	catch(Exception r)// ye bhi likh sakate hai inhereite krta ye lagao ge to exception kon sa pata krene ki 
	// jaroorat nahi 	
	//(ArithmeticException  r) 
	{
	}
	int z3=i*j;
	System.out.println(z3);
	System.out.println("normal flow ");
	
}
}
