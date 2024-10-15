class Outer1
{
int x=10;
static int y=20;

static class Inner
{
public static void main(String a[])
{
System.out.println(y);
Inner i=new Inner();
Outer1 o=new Outer1();

System.out.println(o.x);
  
}
}}
