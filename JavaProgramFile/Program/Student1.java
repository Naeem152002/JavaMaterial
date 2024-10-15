 class Student1{
String name;
int age;
void setData(String n,int a){
name=n ;//compiler autometically add this
age=a;
}
void printData(){
System.out.println("Name="+name);
System.out.println("Age="+age);

}

public static void main(String args[]){
Student1 s=new Student1();
s.setData("Sayam",24);
s.printData();
Student1 s1=new Student1();//object create hua instance variable ko memory locate hui
s1.setData("rame",23);// ye dono value actual argument main set ho gayi
s1.printData();
}
}