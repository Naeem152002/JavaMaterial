interface My1
{                                            
void show();
}

interface My2
{                                            
void display();
void show();
}
interface My extends My1,My2
{
}                                           
class Child implements My
{
public void show()
{
System.out.println("show");
}
public void display()
{
System.out.println("display");
}
public static void main(String a[])
{
Child c=new Child();
c.show();
c.display();
My m=new Child();
m.show();
m.display();
}}




 