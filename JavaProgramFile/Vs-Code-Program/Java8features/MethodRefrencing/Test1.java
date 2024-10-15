

class Student{

    Student(){
        System.out.println("creating object of student class");
    }
    public void display(){
        System.out.println("I am student");
    }

}

interface Provider{
    Student getStudent();
}

public class Test1 {
   public static void main(String[] args) {
    
//1 -way 
//Provider provider=()->{
//     return new Student();
// };
//    Student s=provider.getStudent();
//    s.display();

//construcor refernce 
Provider provider=Student::new;
       Student s=provider.getStudent();
       s.display();
    

   }
    

}
