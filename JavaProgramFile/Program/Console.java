import java.io.*;
class Console
{

public static void main(String ss[])
{

Console c=System.console();


System.out.println("Eneter Password");

char ar[]=c.readPassword();

//for(int i=0;i<ar.length;i++)
//System.out.println(ar[i]);

String s=new String(ar);
System.out.println(s);




}


}