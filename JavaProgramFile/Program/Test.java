import java.util.*;
class Test{
public static void main(String args[]){

Scanner s=new Scanner(System.in);
System.out.println("enter first number");
int num1=s.nextInt();

System.out.println("enter Second number");
int num2=s.nextInt();

int sum=num1+num2;
System.out.println("Sum:="+sum);
try{
int div=num1/num2;
System.out.println("Div:="+div);
}
catch(Exception e){
System.out.println(e);
}
int mul=num1*num2;
System.out.println("Mul:="+mul);
}
}
