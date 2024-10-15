package com.anonymousnestedclass;

class Outer
{

Other ot=new Other()
  {
  int a;
   {
   a=10;
   System.out.println("instance block of anonymous class");
   }
   public void disp()
   {
     System.out.println("disp..."+a);
   }
  };

public void show()
{  
 
 Other ot=new Other()
  {
  int a=10;
   public void disp()
   {
     System.out.println("disp..."+a);
   }
  };

  ot.disp();
}

 
}
public class Test3
{
public static void main(String g[])
{
Outer o=new Outer();
 o.ot.disp();
 o.show();
  
}
} 
/*class Other
{
void disp()
{
}
}*/  

interface Other
{
void disp();
} 

