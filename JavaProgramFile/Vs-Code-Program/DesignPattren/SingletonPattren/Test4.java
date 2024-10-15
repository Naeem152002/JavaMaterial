//braking singleton pattren

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Samosa3 {

    private static Samosa3 samosa3;// object bana ke call nahi kr sakate hian

    private Samosa3() {
        if(samosa3!=null){
            throw new RuntimeException("You are trying to break singleton pattren");
        }

    }

    // lazy way of creating single object-jab app call kroge tab hi call hoga
    public static Samosa3 getSamosa() {

        if (samosa3 == null) {

            synchronized (Samosa1.class) {
                samosa3 = new Samosa3();
            }
        }
        return samosa3;
    }
}

// breaking single pattren using reflection api
public class Test4 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Samosa3 s5 = Samosa3.getSamosa();
        System.out.println(s5.hashCode());

        Constructor<Samosa3> constructor = Samosa3.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa3 s6 = constructor.newInstance();
        System.out.println(s6.hashCode());

    }
}