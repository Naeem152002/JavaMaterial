package com.localnestedclass;


public class Test
{
int x=10;
static int y=20;

void display()
{
   int z=56;//rule

class Inner
{
	static int w=90;
void show()
{
//z=79;
System.out.println(x);
System.out.println(y);
System.out.println(z);
System.out.println(w);
}
}
Inner i=new Inner();
System.out.println("display");
i.show();
}
public static void main(String a[])
{
Test o=new Test();
o.display();



}
}
