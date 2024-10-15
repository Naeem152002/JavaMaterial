import java.io.*;
import java.util.Scanner;
class AtmCard
{
char[] validate()
{
return new char[] {'7','8','6','0','2','3'};
} 
  
public static void main(String args[])

{
Scanner sc=new Scanner(System.in);

Console cnsl = System.console();
int balance=20000;
int count=0;


while(count<4){
System.out.print("enter pin number=");
char[] ch = cnsl.readPassword();
AtmCard c=new AtmCard();
char[] d=c.validate();
count++;
if(d=ch)
{
System.out.println(" Sucessfully");
boolean option = true;
while(option){
System.out.println("choose 1 for withdraw");
System.out.println("choose 2 for deposite");
System.out.println("choose 3 for check balance");
System.out.println("choose operation you want to perform");
int choice = sc.nextInt();  
 switch(choice)  
    {  
case 1:  
System.out.print("Enter money to be withdrawn:");  
int withdraw = sc.nextInt(); 
 if(balance >= withdraw)  
 {
 balance = balance - withdraw;  
 System.out.println("Please collect your money");  
        }  
 else  
 {  
  
 System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
case 2:  
         System.out.print("Enter money to be deposited:"); 
        int deposit = sc.nextInt();   
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
case 3:  
 System.out.println("Balance : "+balance);  
 System.out.println("");  
        break;  }
}}else
 {
System.out.println("invalid...");


 }}
if(count ==4){
System.out.println("Atm is bocked");
}}}