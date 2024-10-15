//braking singleton pattren-use enum 

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

enum Samosa4 {

   INSTANCE;

}

// breaking single pattren using reflection api
public class Test5{
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Samosa4 s5 = Samosa4.INSTANCE;
        System.out.println(s5.hashCode());

        Constructor<Samosa4> constructor = Samosa4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa4 s6 = constructor.newInstance();
        System.out.println(s6.hashCode());

    }
}