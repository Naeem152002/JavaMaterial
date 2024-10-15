class JavaTrainee3{
String name,mobile,email;
int age;
float fess;
void setInfo(){
name="Rahul";
mobile="9876876589";
email="rahul@gmail.com";
age=24;
fess=4.5f;
}
void setInfo(String n,String m,String e,int a,float f){
name=n;
mobile=m;
email=e;
age=a;
fess=f;
}

void showInfo(){
System.out.println("Name="+name);
System.out.println("Mobile="+mobile);
System.out.println("Email="+email);
System.out.println("Age="+age);
System.out.println("Fess="+fess);
}
public static void main(String args[]){
JavaTrainee3 j=new JavaTrainee3();
j.setInfo();
j.showInfo();
JavaTrainee3 j1=new JavaTrainee3();
j1.setInfo();
j1.showInfo();
JavaTrainee3 j2=new JavaTrainee3();
j2.setInfo("Naeem","9876564321","naeem@gamail.com",25,9.6f);
j2.showInfo();
JavaTrainee3 j3=new JavaTrainee3();
j3.setInfo("Stakiyo","9087654321","stakiyo@gamail.com",23,9.8f);
j3.showInfo();






}
}
