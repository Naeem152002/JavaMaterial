class Employee
{
String name;
int age;
Address adr;

Employee(String name,int age)
{
this.name=name;
this.age=age;
this.adr=adr;
adr=new Address("noida","up","india");
}

void show()
{
System.out.println(name);
System.out.println(age);
System.out.println(adr.city+" "+adr.state+" "+adr.country);
}

public static void main(String ss[])
{
Employee e=new Employee("ram",34);
e.show();

}


}



class Address
{
String city,state,country;

Address(String city,String state,String country)
{
this.city=city;
this.state=state;
this.country=country;
}

}