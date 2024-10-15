class K3{
	K3(){
		System.out.println("K const...");
	}
}
class L3 extends K3{
	L3(int x){
		System.out.println(x);
	}
}
public class Test15 extends L3 {
	Test15(){
		super(23);// Second method ye default const banaya kyuki hum parameter pass kr liye hai
		System.out.println("Test14 const...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test15();
	}


}

