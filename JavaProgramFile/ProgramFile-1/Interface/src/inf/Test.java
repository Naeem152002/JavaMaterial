package inf;
public class Test implements I{

	@Override
	public void method() {
		System.out.println("method of Test");
		
	}

	@Override
	public void disp() {
		System.out.println("disp of Test");
		
	}
	public static void main (String args[]) {
		
		I i=new Test();
		i.method();
		i.disp();
	}
}