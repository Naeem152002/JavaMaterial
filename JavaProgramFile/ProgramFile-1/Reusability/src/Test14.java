class K2{
	K2(){

		System.out.println("K const...");
	}
}
class L2 extends K2{
	L2(int x){
		System.out.println(x);
	}
	L2(){
		// first method ye default const banaya kyuki hum parameter pass kr liye hai.
		System.out.println("L const...");
	}
}
public class Test14 extends L2 {
	Test14(){
		super(34);
		System.out.println("Test14 const...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test14();
	}


}
