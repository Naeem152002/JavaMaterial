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
void show()
{
B.disp(this);
System.out.println("show...");
}
void m1()
{
System.out.println("m1..");
}
}
class ThisTest4
{
public static void main(String ss[])
{
A a=new A();
a.show();
}

}