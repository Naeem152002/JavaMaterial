// Dynamicaly

class Parent2{
	int x=10; //refernce ke type ke karan parent ka data print hoga
	static int y=30;
void show() {
	System.out.println("parent of mathod");
}
static void disp() {
	System.out.println("disp of parent ");
}
Parent2 (){
	System.out.println("const of parent");
}
}
class Derivied2 extends Parent2 {
	int x=20;
void show() {
	System.out.println("Derivied of method ");
}
static void disp() {
	System.out.println("disp of child ");
}
}
public class Test4 {
public static void main(String args [] ) {
	try {
		Class c=Class.forName(args[0]);// koi bhi run time pe  class do mai use load karunga aur uska object bana 
		Parent2 t=(Parent2)c.newInstance();// dunga aur use parent type mai type cast krke rakhlunga -iska matlab 
		//ye hai ki unhi class ko  laoda kara sakte ho jo parent ka child ho
Parent2 d=new Derivied2 ();// upcasting 
System.out.println(d.x);
System.out.println(d.y);
d.show();//instruction generate ho jata hai compiler ke andar -virtual 
d.disp();// invoke static 
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}


