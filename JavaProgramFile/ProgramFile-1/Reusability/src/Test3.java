// Data hiding :with super
class Base2{
	int x=10;
	
}
public class Test3 extends Base2 {
	int x =49;
	void show() {
		System.out.println(x);
		System.out.println(super.x);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test3 t=new Test3();
t.show();
	}

}

