// Data hiding:with out super
class Base1{
	int x=10;
	
}
public class Test2 extends Base1 {
	int x =49;
	void show(Base1 t) {
		System.out.println(t);
		
		
	
		System.out.println(t.x);
		System.out.println(x);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 t=new Test2();
t.show(t);
	}

}
