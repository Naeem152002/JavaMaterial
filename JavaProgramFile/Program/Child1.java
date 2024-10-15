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

class Child extends Base
{

Child()
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
Child b=new Child();
System.out.println(b.x);
new Child().show();
b.show();

System.out.println(new Child().y);
System.out.println(b.y);
System.out.println(Child.y);
new Child().disp();
b.disp();
Child.disp();

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