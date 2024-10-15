abstract interface Demo
{
int x=10;
abstract void show();
abstract void disp();
 
static void m1()
{

}

default void m2()
{

}

}
abstract class A implements Demo
{
}

class B implements Demo
{

public void show()
{
System.out.println("show of B");
}

public void disp()
{
System.out.println("disp of B");
}

public static void main(String ss[])
{
//Demo s=new Demo();
Demo s;
s=new B();
s.show();
s.disp();



}

}