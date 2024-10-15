class Car2{
String name,color;
Car2(String n,String c){
name=n;
color=c;
}
Car2(){
}
void show(){
System.out.println("Name="+name);
System.out.println("Color="+color);

}
public static void main(String args[]){
Car2 c=new Car2("Pen" ,"Black");
c.show();
Car2 c1=new Car2();
c1=c;//is cancept ko deep copy bolate hain kyuki memory dono ki same hain 
c1.show();


}
}