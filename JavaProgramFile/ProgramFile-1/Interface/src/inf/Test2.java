package inf;
abstract class G1 implements III{
}
 abstract class P1 extends G1{

 }	
public class Test2 extends P1 implements III1,III2{// dono ek saath kr sakate hai 

	@Override
	public void method() {
	System.out.println("method of Test2");
		
	}
	@Override
	public void disp() {
		System.out.println("disp of Test2");
		
	}
@Override
public void m1() {
	System.out.println("m1 of ");
	
}
@Override
public void m2() {
	// TODO Auto-generated method stub
	
}public static void main (String args []) {
	
	
	III t1=new Test2();
	t1.method();
	t1.disp();
}

}


