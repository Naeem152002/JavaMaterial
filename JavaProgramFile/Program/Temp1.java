class Outer
{
int x=10;
static int y=20;
static class Inner
{
//void show()
static void show()
{
 System.out.println(y);
}
}
public static void main(String a[])
{
System.out.println(y);
Inner i=new Inner();
i.show();
}}

class Temp1 
{
public static void main(String a[])
{
System.out.println(Outer.y);
//System.out.println(Outer.Inner.y);//it create err
Outer.Inner.show();//it execute with static method
 Outer.Inner i=new Outer.Inner();
i.show();
}
}