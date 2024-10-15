class A
{
 
static
{ 
System.out.println("A cons...");
}
}

class B  
{

static
{
System.out.println("B con... ");
}
}

class D1 
{
static 
{
System.out.println("c cons...");
}

public static void main(String ss[])
{
 
try
{
Class c=Class.forName(ss[0]);
c.newInstance();
System.out.println(c);

}
catch(Exception e)
{
System.out.println(e);

}


}
}