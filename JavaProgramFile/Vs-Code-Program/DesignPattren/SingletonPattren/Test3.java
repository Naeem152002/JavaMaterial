//braking singleton pattren

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Samosa2 {

    private static Samosa2 samosa2;// object bana ke call nahi kr sakate hian

    private Samosa2() {

    }

    // lazy way of creating single object-jab app call kroge tab hi call hoga
    public static Samosa2 getSamosa() {

        if (samosa2 == null) {

            synchronized (Samosa1.class) {
                samosa2 = new Samosa2();
            }
        }
        return samosa2;
    }
}

// breaking single pattren using reflection api
public class Test3 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Samosa2 s2 = Samosa2.getSamosa();
        System.out.println(s2.hashCode());

        Constructor<Samosa2> constructor = Samosa2.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa2 s4 = constructor.newInstance();
        System.out.println(s4.hashCode());

    }
}