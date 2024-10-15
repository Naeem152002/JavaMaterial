class Car4{
String name,color;
Car4(String n,String c){
name=n;
color=c;
}
Car4(){
}
void show(){
System.out.println("Name="+name);
System.out.println("Color="+color);

}
public static void main(String args[]){
Car4 c=new Car4("Pen" ,"Black");
c.show();
Car4 c1=new Car4();//shello copy memory alag -2 data same hain
c1.name=c.name;
c1.color=c.color;
c1.show();


}
}