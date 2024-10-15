class JavaTrainee6{
String name;
int age;
float fess;
String college;
JavaTrainee6(){
name="ram";
age=34;
fess=35.f;
college="Its";
}
JavaTrainee6(String n,int a, float f, String c){
name=n;
age=a;
fess=f;
college=c;
}
void showInfo(){
System.out.println(name+""+age+""+fess+""+college);
}
public static void main(String args[]){
System.out.println("*****");
JavaTrainee6 t=new JavaTrainee6();
t.showInfo();
JavaTrainee6 t1=new JavaTrainee6();
t1.showInfo();

JavaTrainee6 t2=new JavaTrainee6("vimal",22,8.9f,"Dbs");
t2.showInfo();

JavaTrainee6 t3=new JavaTrainee6("rohit",34,9.6f,"ops");
t3.showInfo();

}
}