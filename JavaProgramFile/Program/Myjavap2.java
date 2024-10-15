import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class A
{
private String name="baba";	
}

public class MyJavaP   
 {
    public static void main( String[] args ) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
    { 
    	
    	A a=new A();
    	Class class1=a.getClass();
    	Field declaredField = class1.getDeclaredField("name");
    	declaredField.setAccessible(true);
    	
    	 String s=(String)declaredField.get(a);
    	 System.out.println(s);
    }
}
