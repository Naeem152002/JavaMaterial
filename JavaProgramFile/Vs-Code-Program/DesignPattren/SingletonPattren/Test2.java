
class Samosa1 {

    private static Samosa1 samosa1;// object bana ke call nahi kr sakate hian

    private Samosa1() {

    }

    // lazy way of creating single object-jab app call kroge tab hi call hoga
    public static Samosa1 getSamosa() {

        if (samosa1 == null) {

            synchronized (Samosa1.class) {
                samosa1= new Samosa1();
            }
        }
        return samosa1;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Samosa1 sa1 = Samosa1.getSamosa();
        System.out.println(sa1.hashCode());
        Samosa1 sa2 = Samosa1.getSamosa();
        System.out.println(sa2.hashCode());

    }
}