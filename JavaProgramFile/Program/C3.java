class  A
{
 A()
{
this(23,34);
System.out.println("A");
}
 A(int x)
{
 System.out.println(x);
}

A(int x,int y)
{
this(34);
System.out.println(x);
System.out.println(y);
}
}
class B extends A
{
B(int x,int y)
{
System.out.println(x);
System.out.println(y);
}
 B()
{
this(36,66);
System.out.println("B");
}
B(int x)
{
this();
System.out.println(x);
}
}
class C3 extends B
{
C3()
{
this(10);
System.out.println("C");
}
C3(int x)
{
super(20);
System.out.println(x);
}
public static void main (String args[])
{
new C3();
new C3(10);
}
}