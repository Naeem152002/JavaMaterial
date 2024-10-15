class A
{

A()
{

System.out.println("A cons...");
}
}

class B extends A
{
B()
{this(78);
System.out.println("B default cons...");
}


B(int x)
{
System.out.println("B cons...");
}

}

class C2 extends B
{
C2()
{
System.out.println("c cons...");
}

public static void main(String ss[])
{
C2 c=new C2();
}
}