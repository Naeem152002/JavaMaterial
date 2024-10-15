class Base
{
int x=10;
static int y=20;

void show()
{
disp();
System.out.println(y);

System.out.println("show");
}

static void disp()
{
System.out.println("disp");
}

Base()
{
show();

disp();
System.out.println(y);

System.out.println(x);
}

void m1()
{
show();
System.out.println(x);
}

public static void main(String ss[])
{
System.out.println(new Base().x);
Base b=new Base();
System.out.println(b.x);
new Base().show(); 
b.show();

disp();
System.out.println(y);

System.out.println(new Base().y);
System.out.println(b.y);
System.out.println(Base.y);
new Base().disp();
b.disp();
Base.disp();






}

}

class Child1 extends Base
{

Child1()
{

disp();
System.out.println(y);

show();
System.out.println(x);
}

void m2()
{
disp();
System.out.println(y);

show();
System.out.println(x);
}
public static void main(String ss[])
{

disp();
System.out.println(y);


System.out.println(new Child().x);
Child1 b=new Child1();
System.out.println(b.x);
new Child1().show();
b.show();

System.out.println(new Child1().y);
System.out.println(b.y);
System.out.println(Child1.y);
new Child1().disp();
b.disp();
Child1.disp();

}

}


class Other
{
public static void main(String ss[])
{
System.out.println(new Base().x);
Base b=new Base();
System.out.println(b.x);
new Base().show(); 
b.show();
System.out.println(new Base().y);
System.out.println(b.y);
System.out.println(Base.y);
new Base().disp();
b.disp();
Base.disp();


}

}