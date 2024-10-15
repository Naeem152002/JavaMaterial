
class Samosa{

    private static Samosa samosa;//object bana ke call nahi kr sakate hian

    private Samosa(){

    }
    //lazy way of creating single object-jab app call kroge tab hi call hoga 
    public static Samosa getSamosa(){
        
if(samosa==null){

    samosa=new Samosa();
}
return samosa;
    }
}

public class Test{
public static void main(String[] args) {
           Samosa samosa1=Samosa.getSamosa();
           System.out.println(samosa1.hashCode());
           Samosa samosa2=Samosa.getSamosa();
           System.out.println(samosa2.hashCode());
        
    }
}