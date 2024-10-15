class Boss
{
int x=200;
}
class BaseKaBase extends Boss
{
int x=100;
}
class Base extends BaseKaBase
{
int x=10;
}
class Child extends Base
{
int x=20;

void show(Base b,BaseKaBase bb,Boss bs)
{
System.out.println(b.x);
System.out.println(bb.x);
System.out.println(bs.x);
System.out.println(x);
}

public static void main(String ss[])
{
Child c=new Child();
//Base b=new Child(); //upcasting
c.show(c,c,c);
}
}