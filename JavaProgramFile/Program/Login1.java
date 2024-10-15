import java.util.*;

class Login1{
String username;
int password;
boolean validate(Login1 l){
return (this.username.equals("naeemkuraishi")&& this.password==(786023)?true:false);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter user name");
String user=sc.nextLine();

System.out.println("enter password ");
int pass=sc.nextInt();
 
Login1 l=new Login1();
l.username=user;
l.password=pass;
boolean result=l.validate(l);
if(result){
System.out.println("sucessfully");
}
else{
System.out.println("invalid");
}
}}
