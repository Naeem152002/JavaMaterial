class A implements I1
{
public void show()
{
System.out.println("show of Base");
}

}

interface I1
{
void show();
}

interface I2
{
void disp();
}

interface I extends I1,I2
{

}

class B extends A implements I //I1,I2
{
public void disp()
{
}

public static void main(String ss[])
{
I i=new B();
i.show();
i.disp();
}
}