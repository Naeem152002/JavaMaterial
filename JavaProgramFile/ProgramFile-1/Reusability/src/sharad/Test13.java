package sharad;
import java.util.Scanner;

class X2{
	static int x=10;
	X2(){
		System.out.println("constructore");
	}
	static {

	System.out.println("Loading  M is loaded");
}
}
class Y2{
	Y2(){
		System.out.println("construcotor");
	}
	static {
		System.out.println("Loading N is loaded");
}
}
public class Test13{
static {
	System.out.println("Loading is loaded");
}

public static void main(String[] args) { //throws ClassNotFoundException {
		// TODO Auto-generated method stub
	Scanner s=new Scanner (System.in);
System.out.println("enter the name of class to be loading");
String name=s.next();
try {
//Class.forName(name); ye class class ka object bhi deta hia runtime per .aur c mai hold krke deta hai
	Class c=Class.forName(name);
	try{
		c.newInstance();
	}catch (InstantiationException e) {
		e.printStackTrace();
	}catch (IllegalAccessException e) {
		e.printStackTrace();
	}
System.out.println(c);
}catch (ClassNotFoundException e) {
e.printStackTrace();
	}

}
}


