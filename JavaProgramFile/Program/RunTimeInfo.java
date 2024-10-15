import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.lang.reflect.*;
public final class RunTimeInfo
{
public static void main(String...s)
{
try
{
Class c=Class.forName(s[0]);
System.out.println(c.getName());
System.out.println(c.getSuperclass().getName());
System.out.println(c.isInterface());
int i=c.getModifiers();
System.out.println(Modifier.isPublic(i));
System.out.println(Modifier.isFinal(i));
System.out.println(Modifier.isPrivate(i));
System.out.println(Modifier.isAbstract(i));

}catch(Exception e)
{System.out.println(e);}
}
}