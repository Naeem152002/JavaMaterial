import java.io.*;
class Test
{
public static void main(String ss[])
{
Console c=System.console();
String s1=c.readLine("Enter First No");
String s2=c.readLine("Enter Second No");
double d1=Double.parseDouble(s1);
double d2=Double.parseDouble(s2);
System.out.println(d1+d2);

}


}