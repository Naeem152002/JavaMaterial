class Outer
{
int x=10;
static int y=20;

private static class Inner 
{
    void show()
{
//System.out.println(x);  
System.out.println(y);
}
}
public static void main(String a[])
{
System.out.println(y);
Outer.Inner i1=new Outer.Inner();
 i1.show();
Inner i=new Inner();
i.show();
Outer o=new Outer();
System.out.println(o.x);
}}