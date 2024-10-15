class Employee
{
String name;
int age;
static Address adr;

Employee(String name,int age,Address adr)
{
this.name=name;
this.age=age;
this.adr=adr;
}

void show()
{
System.out.println(name);
System.out.println(age);
System.out.println(adr.city+" "+adr.state+" "+adr.country);
}

public static void main(String ss[])
{
adr=new Address("noida","up","india");
Employee e=new Employee("ram",34,adr);
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