 

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

class B extends A implements  I1,I2
{
public void disp()
{
}
public void show()
{
}
public static void main(String ss[])
{
I1 i=new B();
i.show();
try
{
i.wait();
i.notify();
 }
catch(Exception e)
{}
}
}