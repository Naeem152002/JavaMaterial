class Base  
{
Base show()
{
System.out.println("show of Base");
return this;
} 
}
class Child extends Base
{
Child show()
{
System.out.println("show of Child");
return this;
}
void disp()
{
System.out.println("Covarient Return....");
}

public static void main(String ss[])
{
Child c=new Child(); 
c.show().disp();
}
}