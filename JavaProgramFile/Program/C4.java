 class  A
{
  A()
{
this(30);
System.out.println("A");
}

static
{
new A();
System.out.println("This is static Block....");
}

{ 
System.out.println("This is init Block1....");
}
A(int x)
{
System.out.println(x);
}

{
System.out.println("This is init Block2....");
}

}
class B extends A
{
 B()
{
System.out.println("B");
}
B(int x)
{
this();
System.out.println(x);
}
}
class C4 extends B
{
C4()
{
this(10);
System.out.println("C");
}
C4(int x)
{
super(20);
System.out.println(x);
}
public static void main (String args[])
{
 new C4();
 
}
}