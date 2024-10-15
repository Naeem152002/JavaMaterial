/* inheritance ke case mai 3 to ye const chalenge aur ek object ka chalega jo hume dikh nahi raha hai.aur isliye 
  chalega kyuki  copilatin ke dauran compiler ek default const create karata aur every const ke top per super add
  kr deta*/
 
class K{
	K(){
		System.out.println("K const...");
	}
}
class L extends K{
	L(){
		System.out.println("L const...");
	}
}
public class Test12 extends L {
	Test12(){
		System.out.println("Test12 const...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test12();
	}

}
