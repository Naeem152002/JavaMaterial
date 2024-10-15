package encp;
	import java.util.Scanner;
	public class Test2 {

		public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter your name");
	String name =sc .next();
	System.out.println("enter your pass ");
	String pass =sc.next();

	Login login =new Login(name,pass);
	String msg=Validation2.validate(login);
	if(msg.equals("valid"))
		System.out.println("welcome"+login.getName());
	else
		System.out.println("faild....");
	


		}

	}
