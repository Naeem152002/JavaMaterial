class Car1{
String name,color;
Car1(String n,String c){
name=n;
color=c;
}
Car1(){
}
void show(){
System.out.println("Name="+name);
System.out.println("Color="+color);

}
public static void main(String args[]){
Car1 c=new Car1("Pen" ,"Black");
c.show();

Car1 c1=new Car1();
c1.show();
c1=c;

Car1 c2=new Car1();
c2.show();
}
}