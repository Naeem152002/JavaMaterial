class C{
	
}
class B extends C{
	
}
class Demo{
C show() {
	System.out.println("show of Demo");
	return new C();
}
}
public class DemoOverride extends Demo {
B show() {
	System.out.println("show of DemoOverride1");
	return new B();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOverride d=new DemoOverride();
		d.show();

	}

}
