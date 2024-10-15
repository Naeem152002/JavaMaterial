class K4{
	K4(){
		System.out.println("K const...");
	}
}
class L4 extends K4{
	L4(int x){
		//this();
		System.out.println(x);
	}
	L4(){
	// third  method ye default const banaya kyuki hum parameter pass kr liye hai.
		System.out.println("L const...");
	}
}
public class Test16 extends L4{
	Test16(){
		super(23);
		System.out.println("Test16 const...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test16();
	}


}

