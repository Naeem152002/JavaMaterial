//Method overriding 
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
super.show();
System.out.println("show of Child");
}

public static void main(String ss[])
{
Child c=new Child(); 
c.show();
}
}