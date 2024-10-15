/* Alag -2 object per same data chiye to non parameterized use kre */
class Student{
String name;
int age;
void setData(){
age =120;
name="ram";
}
void printData(){
System.out.println("Name="+name);
System.out.println("Age="+age);
/*System.out.println(name);
System.out.println(age);logic separate rakhan chaiye*/

}

public static void main(String args[]){
Student s=new Student();
s.setData();
s.printData();
Student s1=new Student();
s1.setData();
s1.printData();
}
}
