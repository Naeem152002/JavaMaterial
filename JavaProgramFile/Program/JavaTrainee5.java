class JavaTrainee5{
String name;
int age;
float fess;
String college;
JavaTrainee5(String s){
name=s;
}
void show(){
System.out.println(name+" "+age+" "+fess+" "+college);
}
public String toString(){
return name;
}
public static void main(String args[]){
JavaTrainee5 t=new JavaTrainee5("how");
System.out.println(t);
String r=new String("hellow");
System.out.println(r);
}
}