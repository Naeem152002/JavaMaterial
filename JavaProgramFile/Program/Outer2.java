class Outer2
{
int x=10;
static int y=20;

void display()
{
   int z=56;//rule

class Inner
{
void show()
{
//z=79;
System.out.println(x);
System.out.println(y);
System.out.println(z);
}
}
Inner i=new Inner();
System.out.println("display");
i.show();
}
public static void main(String a[])
{
Outer2 o=new Outer2();
o.display();
}
}