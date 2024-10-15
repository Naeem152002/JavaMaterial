//Reflected copy 
class A
{
static int x=10;
static
{ 
System.out.println("A cons...");
}
}

class B  //extends A
{

static
{
System.out.println("B con... ");
}
}

class D  
{
static 
{
System.out.println("c cons...");
}

public static void main(String ss[])
{
D c=new D();
Class c1=c.getClass();
System.out.println(c1);
c1.getName();

Class c2=C.class;
System.out.println(c2);


}
}