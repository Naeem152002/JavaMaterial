// method hiding 
class Demo3{
	public static void show() {
		System.out.println("show of Demo3");
	}
	
}

public class Test9 extends Demo3 {
	public static void show() {
		System.out.println("show of Demooverride");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test9 t =new Test9();
show();
	}

}
