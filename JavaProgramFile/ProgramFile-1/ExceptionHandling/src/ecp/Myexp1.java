// hum cahate hai rest of code chale to hume trycatch banalena chaiye 
package ecp;
import java.util.Scanner;
class MyException1 extends ArithmeticException{
	public MyException1(String string) {
		super(string);
	}
}
public class Myexp1 {
public static void main(String arsg[]) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter your age");
	int age=s.nextInt();
	if(age<18)
		try {
	throw new MyException1("invalid age");
		}catch(MyException1 e) {
			System.out.println(e.getMessage());
		}
	else
		System.out.println("valid age and go for voting");
System.out.println("rest of code");
}
}
