import java.lang.reflect.*;
import java.awt.*;
class SampleName
{
public static void printName(Object o)
{
Class c=o.getClass();
System.out.println(c.getName());
}
public static void printName(String s)
{
try
{
Class c=Class.forName(s);
System.out.println(c.getName());
StringBuffer sb=(StringBuffer)c.newInstance();//without new,it is hard code
System.out.println(sb.length());
System.out.println(sb.capacity());
}catch(Exception e)
{
System.out.println(e);
}}
public static void main(String a[])
{

//Button b=new Button("ok");//object, 1st way

//printName(b);

printName("java.lang.StringBuffer");//string form hard coded,2nd way
//Class c=java.lang.Thread.class;// 3rd way
//System.out.println(c.getName());
}
}