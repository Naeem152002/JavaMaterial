//Constructor chaining 
public class A5
{
 
A5()
{
this(45);
System.out.println("cons");
}

A5(int x)
{
this(343,3);
System.out.println(x);
}

A5(int x,int y)
{
System.out.println(x);
System.out.println(y);
}

public static void main(String ss[])
{
new A5(); 
}
}