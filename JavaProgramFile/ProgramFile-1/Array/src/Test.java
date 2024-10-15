public class Test {
	
	public static int getObject() {
		return 6;
	}
public static void main (String arg []) {
	Test x[]=new Test [10];
	// class type ka array naki object 
	System.out.println(x);
	 
	Object o=getObject();
	System.out.println(o);
	
	
}
}
