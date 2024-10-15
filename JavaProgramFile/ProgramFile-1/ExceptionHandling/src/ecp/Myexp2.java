
package ecp;
import java.util.Scanner;
class MyException2 extends ArithmeticException{
	String string;
	public MyException2(String string) {
		this.string=string;
	}
	public String toString() {
		return string;
	}
}
public class Myexp2 {
public static void main(String arsg[]) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter your age");
	int age=s.nextInt();
	if(age<18)
		try {
	throw new MyException2("invalid age");
		}catch(MyException2 e) {
			System.out.println(e);
		}
	else
		System.out.println("valid age and go for voting");
System.out.println("rest of code");
}
}
