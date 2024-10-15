class JavaTrainee1
{

String name,mobile,email;
int age;
float fess;

 
void read()
{
System.out.println("rad....");
}

void chat()
{
System.out.println("chat.....");
}

void showInfo()
{
System.out.println(name);
System.out.println(mobile);
System.out.println(email);
System.out.println(age);
System.out.println(fess);
}

public static void main(String[] args)
{

JavaTrainee1 t=new JavaTrainee1();
System.out.println(t);
t.name="ram";
t.mobile="2323232";
t.email="r@gmail";
t.age=23;
t.fess=5.5f;
t.showInfo();

JavaTrainee1 t1=new JavaTrainee1();
t1.showInfo();
t1.name="shyam";
t1.mobile="12121";
t1.email="s@gmail";
t1.age=43;
t1.fess=7.5f;
t1.showInfo();

JavaTrainee1 t2=new JavaTrainee1();
t2.name="mohan";
t2.mobile="111";
t2.email="m@gmail";
t2.age=63;
t2.fess=8.5f;
t2.showInfo();

JavaTrainee1 t3=new JavaTrainee1();
t3.name="baba";
t3.mobile="3434";
t2=t3;
System.out.println(t3);
System.out.println(t2);
t3.name="java";
System.out.println(t2.name);










}

}