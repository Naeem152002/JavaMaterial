
public class Test8 {

}abstract class Operations{
    abstract void add(int a,int b);
    abstract void mul(int a,int b);
    }
abstract class Dev1 extends Operations {
    void add(int a,int b){
        System.out.println(a+b);
    }
}
class Dev2 extends Dev1 {
    void mul(int a,int b){
        System.out.println("a*b");
    }
}
class TestCLient1 {
public static void main(String[] args){
 Dev2 d=new Dev2();
 d.add(10,20);
 d.mul(4,5);
}}

