// const .. chaining  
class K5{
	K5(){
		System.out.println("K const...");
	}
	K5(int x){
		this();
		System.out.println(x);
	}
}
class L5 extends K5{
	L5(int x){
		this();
		System.out.println(x);
	}
	L5(){
	this(34,46);
		System.out.println("L const...");
	}
	L5(int x ,int y){
		super(34);
		System.out.println(x);
	}
}
public class Test17 extends L5{
	Test17(){
		super(23);
		System.out.println("Test17 const...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test17();
	}


}

