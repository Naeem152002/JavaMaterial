class A{
void show(){
System.out.println("B");
}

} 

class B extends A{
void show(){
System.out.println("C");
}
public static void main(String args[]){
A a=new A();
a.show();


}}