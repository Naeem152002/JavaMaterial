import java.util.Optional;

public class Test{
    public static void main(String[] args) {
        
       // String str="java is my favorite";
       String str=null;

        // if(str==null)
        // {
        //     System.out.println("this not true");
        // }
        // else{
        //     System.out.println("this is true");
        // }


        Optional<String>opt=Optional.ofNullable(str);
        System.out.println(opt.isPresent());

        System.out.println(opt.get());

    }
}