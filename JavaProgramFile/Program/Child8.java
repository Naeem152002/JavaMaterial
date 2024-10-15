class Base  
{

public  void show()
{
System.out.println("show of Base");
}
 
}
class Child extends Base
{

public void show()
{
System.out.println("show of Child");
}

public static void main(String ss[])
{
Child c=new Child(); 
c.show();
}
}