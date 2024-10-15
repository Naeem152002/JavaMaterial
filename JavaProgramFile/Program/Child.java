class Base
{
int x=10;
void show()
{
System.out.println("show");
}
}

class Child extends Base 
{

int y=20;
void disp()
{
System.out.println("disp");
}

public static void main(String ss[])
{
Child c=new Child();
c.show();
c.disp();
System.out.println(c.x);
System.out.println(c.y);




}

}