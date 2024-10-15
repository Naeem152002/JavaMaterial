class Base
{
int x=10;

}

class Child extends Base
{

int x=20;

void show()
{
System.out.println(x);
System.out.println(x);
}


public static void main(String ss[])
{
Child c=new Child();
c.show();
}
}