class Stuff{
    public static void  doStuff(){
        System.out.println("this is doStuff");
        System.out.println("this second line");

    }
    public  void  show(){
        System.out.println("this is show");
        System.out.println("this second line");

    }


}
interface WorkInter{


    void doTask();
}
public class Test{
    public static void main(String[] args) {
        
WorkInter w=Stuff::doStuff;
w.doTask();


Runnable r=Stuff::doStuff;

Thread th=new Thread(r);
th.start();


Stuff s=new Stuff();


Runnable r2=s::show;

Thread th1=new Thread(r2);

th1.start();




    }



}