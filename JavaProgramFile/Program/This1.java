class This1
{
 
int x=10;

This1()
{
System.out.println(this);
}

void show(int x)
{
System.out.println(this.x);
System.out.println(x);
System.out.println(this);

}

public static void main(String ss[])
{

 This1 t=new This1();
t.show(23);
System.out.println(t);  

 This1 t1=new  This1();
t1.show(34);
System.out.println(t1);  

}

}