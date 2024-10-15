// type casting :
class Pardada1{
	int x=100;
}
class Dada1 extends Pardada1{
	int x=200;
	
}
class Base4 extends Dada1{
	int x=10;
}
public class Test5 extends Base4{
	int x=50;
	void disp() {
		System.out.println(((Base4)this).x);
		System.out.println(((Dada1)this).x);
		System.out.println(((Pardada1)this).x);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test5 t=new Test5();
t.disp();
	}

}


