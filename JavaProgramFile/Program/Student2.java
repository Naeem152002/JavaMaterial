
class Student
{
String name;
int age;

Student(String name,int age)
{
this.name=name;
this.age=age;
}

void show()
{
System.out.print(name+" "+age);
}

public static void main(String ss[])
{
Student s=new Student("ram",34);
s.show();
}
}