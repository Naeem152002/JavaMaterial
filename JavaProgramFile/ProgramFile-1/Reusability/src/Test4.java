// Upcasting 
class Pardada{
	int x=100;
}
class Dada extends Pardada{
	int x=200;
	
}
class Base3 extends Dada{
	int x=10;
}
public class Test4 extends Base3{
	int x=50;
	void disp(Base3 t, Dada t1,Pardada t2) {
		System.out.println(t1.x);
		System.out.println(super.x);
		System.out.println(super.x);
		System.out.println(t.x);
		System.out.println(t2.x);
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test4 t=new Test4();
t.disp(t,t,t);
	}

}
