class Parent1{
	int x=10; //refernce ke type ke karan parent ka data print hoga
	static int y=30;
void show() {
	System.out.println("parent of mathod");
}
static void disp() {
	System.out.println("disp of parent ");
}
}
class Derivied1 extends Parent1 {
	int x=20;
void show() {
	System.out.println("Derivied of method ");
}
static void disp() {
	System.out.println("disp of child ");
}
}
public class Test3 {
public static void main(String aggs [] ) {
Parent1 t=new Derivied1 ();// upcasting 
System.out.println(t.x);
System.out.println(t.y);
t.show();//instruction generate ho jata hai compiler ke andar -virtual 
t.disp();// invoke static  
}
}

