class Parent{
	int x=10; //refernce ke type ke karan parent ka data print hoga
	static int y=30;
}
class Derivied extends Parent {
	int x=20;
}
public class Test2 {
public static void main(String aggs [] ) {
Parent t=new Derivied ();
System.out.println(t.x);
System.out.println(t.y);
}
}
