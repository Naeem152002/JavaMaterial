package ecp;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("enter your name");
 String name=sc .next();
System.out.println("enter your pass ");
String pass =sc.next();

Login login =new Login();
login.setName(name);
login.setPass(pass);
System.out.println(login.getName()+" "+login.getPass());
}

}
