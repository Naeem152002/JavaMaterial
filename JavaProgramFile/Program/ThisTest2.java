class B
{
static void disp(A a)
{
System.out.println("disp...");
a.m1();
}
}
class A
{
void show(A a)
{
B.disp(a);
System.out.println("show...");
}
void m1()
{
System.out.println("m1..");
}
}
public class ThisTest2
{
public static void main(String ss[])
{
A a=new A();
a.show(a);
}

}