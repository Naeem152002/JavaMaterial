
public class Test6 {
	Test6(){
		System.out.println("construcot");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");

}
	static {
		new Test6();
	System.out.println("static block");
	}

}
