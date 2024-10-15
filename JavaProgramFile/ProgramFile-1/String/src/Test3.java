/* jab kisi class ka object banata hai object ke banate hi object class ki refernece id banati hai wo refernece 
id object class ke to string method se banati hai*/
public class Test3 extends Object{
	public Test3(String string) {
	}
	public String toString() {
		//return getClass().getName()+"t"+Integer.toHexString(hashCode());
		return "hathi";
	}
	public static void main(String arg[]) {
		Test3 t=new Test3("he");
		Test3 t1=new Test3("bye");
		String s="hello";// object without new keyword 
	System.out.println(s);
		System.out.println(t);
	}
}
