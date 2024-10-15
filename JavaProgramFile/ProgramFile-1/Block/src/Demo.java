class Demo {
    static 
    {
        System.out.println("Demo class static block  ");
    }
    void wish()
    {System.out.println("Good morning....");
    }
}
class Test{
    public static void main(String[] args) throws Exception {
     // new Demo().wish();
     Class c= Class.forName("Demo");
     Demo d=(Demo)c.newInstance();
      d.wish();
    
    }
}