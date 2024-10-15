
public class Test3 {
int x=10;
static int y=20;
void show() {
	disp();
	System.out.println(y);
System.out.println("show");
System.out.println(x);
 }
static void disp() {
	System.out.println("disp");
	System.out.println(y);
}
void talk() {
	disp();
	System.out.println(y);
show();
}
Test3(){
	disp();
	System.out.println(y);
	System.out.println(x);
show();
}

	public static void main(String[] args) {
		// instance var and method
System.out.println(new Test3().x);
Test3 t=new Test3();
System.out.println(t.x);
new Test3().show();
t.show();
// static var and method
System.out.println(new Test3().y);
System.out.println(t.y);
System.out.println(Test3.y);
System.out.println(y);
new Test3().disp();
t.disp();
 Test3.disp();
 disp();
	}

}
