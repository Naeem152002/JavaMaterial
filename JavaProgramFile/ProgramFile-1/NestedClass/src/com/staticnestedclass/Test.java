package com.staticnestedclass;

public class Test
{
     int x=30;//static nested class non static ko nahi call kr sakte hain
    static int  y = 20; 
    static void info() {
    	System.out.println("info");
    }
void out() {
	System.out.println("out");
}
  
    static class Two 
    {
        int a=30;
        static int  b = 20;  
        void display(Test t)
        {
        	t.out();
        	info();
             System.out.println("y="+y);
            // System.out.println("x="+x);
             System.out.println("a="+a);
             System.out.println("b="+b);
        
        }
        static void show(Test t)
        {t.out();
        	info();
        	System.out.println("y="+y);
        	// System.out.println("x="+x);
        	System.out.println("b="+b);
        	
        }
        
    }

    public static void main(String  args[])
    
    {
    	Test t=new Test();
        Two two = new Two();
        two.display(t);
        two.show(t);
        
       // Test.Two i=new Test.Two();
        
    }
}

