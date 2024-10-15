public class One
{
     int x=30;
    static int  y = 20;  

  
    static class Two 
    {
        int a=30;
        static int  b = 20;  
        void display()
        {
             System.out.println("y="+y);
             //System.out.println("x="+x);
             System.out.println("a="+a);
             System.out.println("b="+b);
        
        }
        
    }

    public static void main(String  args[])
    {
        Two two = new Two();
        two.display();

    }

}
