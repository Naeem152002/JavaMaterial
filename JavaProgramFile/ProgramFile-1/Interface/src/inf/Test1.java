package inf;
abstract class G implements II{
	
}
class P extends G{

	@Override
	public void method() {
		System.out.println("method of P");
		
	}

	@Override
	public void disp() {
	System.out.println("disp of P");
		
	}
	
}
public class Test1 implements II{

	@Override
	public void method() {
	System.out.println("method of Test1");
		
	}
	@Override
	public void disp() {
		System.out.println("disp of Test1");
		
	}

public static void main (String args []) {
	Test1 i=new Test1();
	i.disp();
	i.method();
	P t=new P();
	t.method();
	t.disp();
}

}
