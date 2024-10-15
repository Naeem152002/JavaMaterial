//covairent return type
class A
{}
class B extends A
{}
class Base  
{
A show()
{
System.out.println("show of Base");
return new A();
} 
}
class Child extends Base
{
B show()
{
System.out.println("show of Child");
return new B();
}

public static void main(String ss[])
{
Child c=new Child(); 
c.show();
}
}