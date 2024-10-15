import java. util.Scanner;
class Employee{
//data of The Employee
String name;
int emp_Id;
String aadhar_ID;
int salary;
Scanner s=new Scanner(System.in);
void emp_Info(){
System.out.println("Name of Employee: "+ name);
System.out.println("Employee Id: " + emp_Id);
System.out.println("Aadhar_Id: " + aadhar_ID);
System.out.println("Salary: " + salary);
}
void get_emp_Info(){

System.out.println("Enter the name of Employee > ");
name=s.nextLine();

System.out.println("Enter Employee Id > ");
emp_Id=s.nextInt();
s.nextLine();

System.out.println("Enter Employee Aadhar Id > ");
aadhar_ID=s.nextLine();

System.out.println("Enter Employee salary > ");
salary=s.nextInt();
}
public static void main(String args[]){
Employee e=new Employee();
e.get_emp_Info();
e.emp_Info();
}
}