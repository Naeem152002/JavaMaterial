class JavaTrainee4{
String name;
int age;
float fess;
String college;
void showInfo(){
System.out.println(name+" "+age+" "+fess+" "+college);
}
public static void main(String args[]){
JavaTrainee4 t=new JavaTrainee4();
t.name="ram";
t.age=34;
t.fess=45.5f;
t.college="ITs";
t.showInfo();
System.out.println(t);
JavaTrainee4 t1=new JavaTrainee4();
System.out.println(t1);
t1=t;
System.out.println(t1);

System.out.println(t);
t1.name="baba";
System.out.println(t.name);

JavaTrainee4 t2;
//System.out.println(t2);
t2=new JavaTrainee4();
System.out.println(t2);
t2=t1;
System.out.println(t1);
t.name="ava";
System.out.println(t1.name);
t.name="java";
System.out.println(t1.name);

}
}
