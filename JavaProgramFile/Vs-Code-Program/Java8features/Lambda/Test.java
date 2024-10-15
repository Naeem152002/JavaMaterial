
@FunctionalInterface
interface MyInter {
    void sayHello();
}

class MyInterImpl implements MyInter {

    @Override
    public void sayHello() {
        System.out.println("sayHello");

    }

}

public class Test {
    public static void main(String[] args) {

        // create object
        // MyInter m=new MyInterImpl();
        // m.sayHello();
        // ;

        //anoumous class 
        // MyInter m = new MyInter() {
        //     @Override
        //     public void sayHello() {
        //         System.out.println("this is annoymous class");

        //     }

        // };
        // m.sayHello();

    //     MyInter m=()->{
    //         System.out.println("this is lambada");
    //     };
    // m.sayHello();
    MyInter m=()->//ek stattement ke liye ye bhi kr sakate ho
        System.out.println("this is lambada");
    ;
m.sayHello();

    }
}