package com.staticnestedclass;

public class Test1
{
     int x=30;
    static int  y = 20;  

  
    static class Two  extends Out
    {
        int a=30;
        static int  b = 20;  
        void display()
        {
             System.out.println("y="+y);
             //System.out.println("x="+x);
             System.out.println("a="+a);
             System.out.println("b="+b);
            System.out.println("z="+z);
            System.out.println(w);
            outmethod();

        }
        
    }

    public static void main(String  args[])
    {
        Two two = new Two();
        two.display();

    }

}
class Out  
{
	static int w=78;
    int z=25;
   void outmethod()
   {
       System.out.println("Out method z="+z);

            
    }

}