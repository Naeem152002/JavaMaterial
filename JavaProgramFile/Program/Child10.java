//Runtime Polymorphisam
class Base  
{
void show()
{
System.out.println("show of Base");
}
 
}
class Child extends Base
{
void show()
{
System.out.println("show of Child");
}

public static void main(String ss[])
{
Base b=new Child(); //upcasting...
b.show(); 
}
}