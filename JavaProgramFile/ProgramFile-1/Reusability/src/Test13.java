class K1{
	K1(){
		super();// nahi add karoge to ye apne aap add krlega aur super ki always pahli line me hoga
		System.out.println("K const...");
	}
}
class L1 extends K1{
	L1(){
		super();
		System.out.println("L const...");
	}
}
public class Test13 extends L1 {
	Test13(){
		super();
		System.out.println("Test13 const...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test13();
	}



}
