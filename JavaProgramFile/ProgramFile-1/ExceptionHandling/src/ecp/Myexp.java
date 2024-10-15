// Custom Exception
package ecp;
import java.util.Scanner;
class MyException extends ArithmeticException{
	public MyException(String string) {
		super(string);
	}
}
public class Myexp {
public static void main(String arsg[]) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter your age");
	int age=s.nextInt();
	if(age<18)
	throw new MyException("invalid age");
	else
		System.out.println("valid age and go for voting");
System.out.println("rest of code");
}
}
