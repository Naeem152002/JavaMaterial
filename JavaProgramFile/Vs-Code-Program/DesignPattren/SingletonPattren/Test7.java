import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Samosa6 implements Serializable {

    private static Samosa6 samosa6;// object bana ke call nahi kr sakate hian

    private Samosa6() {

    }

    // lazy way of creating single object-jab app call kroge tab hi call hoga
    public static Samosa6 getSamosa() {

        if (samosa6 == null) {

            synchronized (Samosa6.class) {
                samosa6= new Samosa6();
            }
        }
        return samosa6;
    }
    public Object readResolve(){
        return samosa6;
        
    }
}

public class Test7 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       
        Samosa6 sa6 = Samosa6.getSamosa();
      
        System.out.println(sa6.hashCode());

        ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos1.writeObject(sa6);
       
 System.out.println("serialization done-------");
ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("abc.ob"));
      Samosa6 sas6=(Samosa6)ois1.readObject(); 
      System.out.println(sas6.hashCode());   
    }
}