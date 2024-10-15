import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyJavaP   
 {
    public static void main( String[] args )
    {
    	try
    	{
    		
    	Class c=Class.forName(args[0]);
    	Method[] methods = c.getDeclaredMethods();
    	System.out.println("*********Methods Are.....************");
    	for (Method method : methods) {
			System.out.println(method);
		}
    	
    	Constructor[] declaredConstructors = c.getDeclaredConstructors();
    	System.out.println("*********Constructor Are.....************");
    	 for (Constructor constructor : declaredConstructors) {
		  System.out.println(constructor);	
		}
    	
          System.out.println("*********Fields Are.....************");
     
    	Field[] declaredFields = c.getDeclaredFields();
    	for (Field field : declaredFields) {
    		  System.out.println(field);	
		}
    
    		
    	}
    	catch (Exception e) {
			 e.printStackTrace();
		}
    	
    }

	
}
