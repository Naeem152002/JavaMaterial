//covaraint return type
class C1{
}
class B1 extends C1{
	
}
class Demo1{
	C1 show () {
		System.out.println("show of Demo");
		return new C1();
	}}
public class Test8 extends Demo1 {
	B1 show () {
		System.out.println("show of Demooverride");
		return new B1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test8 t =new Test8();
t.show();
	}

}

