class A
{
int x=10;
void show()
{
System.out.println("show");
}

}

public class Assocation1
{
A a1;//Aggregation

Assocation1()
{
a1=new A();//compostion
}
public static void main(String ss[])
{
A a=new A();
a.show();

}
}