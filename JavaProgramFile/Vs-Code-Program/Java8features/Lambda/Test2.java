
public class Test2 {
    public static void main(String[] args) {


        Runnable r=()->{
for(int i=0; i<=10;i++){
    System.out.println("value os i is"+i);
}

        };
        r.run();
        Thread t= new Thread(r);
        t.start();
    } 
    
    }
