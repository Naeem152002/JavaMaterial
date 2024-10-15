package p2;
public class A1
{

{
System.out.println("init block1");
}


A1()
{
System.out.println("A cons....");
}
 
A1(int x)
{
System.out.println(x);
}

{
System.out.println("init block3");
}

A1(int x,int y)
{
System.out.println(x);
System.out.println(y);
}



{
System.out.println("init block2");
}



public static void main(String ss[])
{
A1 a=new A1();
 A1 a1=new A1(34);
 A1 a2=new A1(56,7);

{
System.out.println("init block4");
}

}

}