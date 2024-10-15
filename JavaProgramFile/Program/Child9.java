//Method Hiding
class Base  
{
static  void show()
{
System.out.println("show of Base");
}
 
}
class Child extends Base
{

static void show()
{
Base.show();
System.out.println("show of Child");
}

public static void main(String ss[])
{
Child c=new Child(); 
c.show();
Base.show();
}
}