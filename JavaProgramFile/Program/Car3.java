class Car3{
String name,color;
Car3(String n,String c){
name=n;
color=c;
}
Car3(Car3 c){
name=c.name;
color=c.color;
}
void show(){
System.out.println("Name="+name);
System.out.println("Color="+color);

}
public static void main(String args[]){
Car3 c=new Car3("Pen" ,"Black");
c.show();
Car3 c1=new Car3(c);//shello copy memory alag -2 data same hain
c1.show();


}
}