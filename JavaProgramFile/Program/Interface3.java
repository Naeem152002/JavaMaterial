interface My
{                                            
void show();
}

interface My1  
{                                            
void display();
}


class Child implements My,My1
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
My m=new Child();
m.show();
My1 m1=new Child();
m1.display();

}}