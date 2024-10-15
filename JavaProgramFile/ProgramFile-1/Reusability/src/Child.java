// total 28 tarike ho gaye hai data ko call krne ke
class Base {
	int x=10;
	static int y=20;
	static void disp() {
		System.out.println(y);
		System.out.println("disp");
	}
	void show () {
		System.out.println(y);
		System.out.println("show of show");
	}
}
public class Child extends Base {
	Child(){
		System.out.println(y);
		show();
	System.out.println(x);
	disp();
	}
	void method() {
		System.out.println(y);
		show();
		System.out.println(x);
		disp();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c=new Child();
System.out.println(new Child().x);
System.out.println(c.x);
c.method();
c.show();
new Child().show();

System.out.println(new Child().y);
System.out.println(c.y);
System.out.println(Child.y);
new Child().disp();
c.disp();
Child.disp();


	}

}
