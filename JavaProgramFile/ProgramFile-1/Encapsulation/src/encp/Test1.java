package encp;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("enter your name");
String name =sc .nextLine();
System.out.println("enter your pass ");
String pass =sc.nextLine();

Login1 login =new Login1(name,pass);
//login.setPass(name);
//login.setName(pass);

System.out.println(login);

//System.out.println(login.getName()+" "+login.getPass());// ise likhoge to print ho jayega 


	}

}
