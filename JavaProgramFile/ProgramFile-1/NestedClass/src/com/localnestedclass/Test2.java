package com.localnestedclass;
class Test2
{

public I show()
{
 int l=1;
class In implements I
{
int i=10;
public void disp()
{
System.out.println("disp.."+(i+l));
}
}
System.out.println(l);
In obj=new In();
obj.disp();

return obj;
}

public static void main(String aa[])
{
Test2 o=new Test2();
I obj=o.show();
obj.disp();
}
}
/*
abstract class Other
{
public abstract void disp();
}
*/

interface I
{
void disp();
}




