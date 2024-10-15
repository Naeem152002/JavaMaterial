package loading;
import java.util.Scanner;

class X1{
	static int x=10;
	static {

	System.out.println("Loading  M is loaded");
}
}
class Y1{
	static {
		System.out.println("Loading N is loaded");
}
}
public class Test12{
static {
	System.out.println("Loading is loaded");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner (System.in);
System.out.println("enter the name of class to be loading");
String name=s.next();
try {
Class.forName(name);
}catch (ClassNotFoundException e) {
e.printStackTrace();
	}

}
}
