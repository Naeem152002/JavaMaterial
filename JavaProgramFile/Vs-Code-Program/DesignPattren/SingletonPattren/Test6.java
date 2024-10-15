import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Samosa5 implements Serializable {

    private static Samosa5 samosa5;// object bana ke call nahi kr sakate hian

    private Samosa5() {

    }

    // lazy way of creating single object-jab app call kroge tab hi call hoga
    public static Samosa5 getSamosa() {

        if (samosa5 == null) {

            synchronized (Samosa5.class) {
                samosa5= new Samosa5();
            }
        }
        return samosa5;
    }
}

public class Test6 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       
        Samosa5 sa5 = Samosa5.getSamosa();
      
        System.out.println(sa5.hashCode());

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(sa5);
       
 System.out.println("serialization done-------");
ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
      Samosa5 sas5=(Samosa5)ois.readObject(); 
      System.out.println(sas5.hashCode());   
    }
}