// first method hai
package encp;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Login login =new Login();

Scanner sc=new Scanner (System.in);
System.out.println("enter your name");
 login.setName(sc .nextLine());
System.out.println("enter your pass ");
login.setPass(sc.nextLine());

//Login login =new Login();

System.out.println(login.getName()+" "+login.getPass());// ise likhoge to print ho jayega 


	}

}
