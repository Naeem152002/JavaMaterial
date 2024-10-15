
public class Employee {
String name;
int age;
Address adr;
Salary sal;
// aggration
Employee(String name,int age,Address adr,Salary sal){
	this.name=name;
	this.age=age;
	this.adr=adr;
	this.sal=sal;
}
void show() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(adr.city);
	System.out.println(adr.state);
	System.out.println(adr.country);
	System.out.println(sal.salary);
	
}
	public static void main(String[] args) {
	//	Address adr=new Address();	
Employee e=new Employee("ram",34,new Address(),new Salary());
e.show();
}
}
 class Address {
	String city,state,country;
	{
		city ="noida";
		state =" up";
		country ="india";
	}
	

}
 class Salary{
	 double salary;{
		 salary =898.343;
	 }
 }
