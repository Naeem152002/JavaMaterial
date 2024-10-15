
public class Test{

    public static void main(String[] args) {
         Employee employee=EmployeeFactory.getEmployee("ANDEROID DEVELOPER");
         System.out.println(employee.Salary());


         Employee employee2=EmployeeFactory.getEmployee("WEB DEVELOPER");
         System.out.println(employee2.Salary());



        }
}