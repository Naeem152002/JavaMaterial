// Isi mai teeno ban sakte ho aur alag bhi .jab  further catrize   ki baat ho.int block mai same class ka object
// bana sakete dusre class ka bana sakate hai.
public class Employee {
String name;
int age;
Address adr;
Salary sal;
{ adr=new   Address ();
}
{
	sal=new Salary();
}
void show () {
	System.out.println("Name="+name);
	System.out.println("Age="+age);
	System.out.println("Address="+adr.city+" "+adr.state+" "+adr.country);
	System.out.println("Salary="+sal.ta+" "+sal.da+" "+sal.hra);
}
	Employee (String n,int a){
		name =n;
		age =a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Employee("ram ",34);
e.show();
	}

}
