// Upcasting :without and with object
class Pardada2{
	int x=100;
}
class Dada2 extends Pardada2{
	int x=200;
	
}
class Base5 extends Dada2{
	int x=10;
}
public class Test6 extends Base5{
	int x=50;
	void disp() {
		System.out.println(new Base5().x);
		System.out.println(new Pardada2().x);
		System.out.println(new Dada().x);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test6 t=new Test6();
t.disp();
	}

}
