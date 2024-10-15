import java.lang.reflect.*;
public class Myjavap
{
public static void main(String s[])
{
try
{
Class c=Class.forName(s[0]);

Method m[]=c.getDeclaredMethods();//sare method return 
System.out.println("****Methods are*****");
for(Method mm:m)
System.out.println(mm);

Field f[]=c.getDeclaredFields();
System.out.println("****Fields are*****");
for(Field ff:f)
System.out.println(ff);

Constructor con[]=c.getDeclaredConstructors();
System.out.println("****Constructors are*****");
for(Constructor cc:con)
System.out.println(cc);

}catch(Exception e)
{System.out.println(e);}
}
}