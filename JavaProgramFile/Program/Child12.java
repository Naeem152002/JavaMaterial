//DownCasting
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
void disp()
{
System.out.println("disp of Child");
}

public static void main(String ss[])
{
//Child b=new Base();
Base b=new Child(); //upcasting...
b.show();
//b.disp();//error
Child c=(Child)b;//downcasting..
c.disp();
}
}