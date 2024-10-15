//Binding
class Parent{
    
        void display() {
        System.out.println("Display  method of Parent");
    }
    
}

public class Children1  extends Parent{
 
static void show(Parent p) {
    System.out.println("Show method of Child");
     p.display();
      
}

public static void main(String[] args) {
     
        Children1.show(new Children1());
}
    
}
