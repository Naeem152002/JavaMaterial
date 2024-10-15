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

void show()
{
System.out.println(this.x);
System.out.println(((Base)this).x);
System.out.println(((BaseKaBase)this).x);
System.out.println(((Boss)this).x);


}

public static void main(String ss[])
{
Child c=new Child(); 
c.show();
}
}