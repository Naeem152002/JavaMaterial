class Parent{
    {
        System.out.println("Init of parent");
    }
    int x=100;
    static int s=200;
    Parent (){
        System.out.println("Dc of  parent  const...");
    }
    
    static void show() {
        System.out.println("Show method of Parent");
    }
    
    void display() {
        System.out.println("Display  method of Parent");
    }
    
}

public class Children  extends Parent{
int x=10;
static int s=20;

{
    System.out.println("init of child");
}
Children(){
    
    System.out.println("DC of Child ...");
}
void display() {
    System.out.println("Display  method of Child");
}
static void show() {
    System.out.println("Show method of Child");
}

public static void main(String[] args) {
    
    Parent c= new Children();//yah compile 3 instructions generate kr dega aur unhe fix kr dega
    // uske baad runtime per jvm dekhega invoke instructions aur
    // suru wale hain unke liye static instructions hain unko to run kr dega 
    //but jo last wala yai wo to dynamic hain binding to dynamic binding to object ke hisab se hoti haiin  to jvm dekhega jiska object hoga usi ko run kr dega 
    System.out.println(c.x);
    System.out.println(c.s);
    c.show(); //ye 3no static binding hogi jiski reference uska chalega 
    c.display(); // ye child ka excute hoga but runtime per jiska object hoga usi ka run hoga 
    

    
}
    
}
