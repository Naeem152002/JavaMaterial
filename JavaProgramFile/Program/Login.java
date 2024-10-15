import java.util.*;

class Login{
public static void main(String args[]){
String username="naeem";
int password=786032;
Scanner s=new Scanner (System.in);
System.out.println("enter user name");
String user=s.nextLine();
System.out.println("enter password");
int pass=s.nextInt();
if(username.equals(user)&&password==pass){
System.out.println("login Sucessfully");
}else{
System.out.println("invalid");
}
}}

