package com.staticnestedclass;

class Test3
{
int x=10;
static int y=20;

private static class Inner 
{
    void show()
{
//System.out.println(x);  
System.out.println(y);
}
}
public static void main(String a[])
{
System.out.println(y);
Test3.Inner i1=new Test3.Inner();
 i1.show();
Inner i=new Inner();
i.show();
Test3 o=new Test3();
System.out.println(o.x);
}}
