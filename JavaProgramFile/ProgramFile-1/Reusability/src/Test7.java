//covariant return type
class Demo2{
	Demo2 show () {
		System.out.println("show of Demo");
		return this;
	}
}
public class Test7 extends Demo2 {
	Test7 show () {
		System.out.println("show of Demooverride");
		return this;
	}
	void disp() {
		System.out.println("welcome to converient ....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test7 t =new Test7();
t.show().disp();
	}

}
