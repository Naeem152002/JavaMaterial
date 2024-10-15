//+ operator overloded
public class Test7 extends Object{
public static void main(String arg[]) {
	String s2="he"+10;//ye + mai only possible hai concate mai donostring hona chaiye 
	/*ye work kaise karata hai :10 integer value hai but internally +overloaded method hai jo 10 integer value 
	 * hai iska object bana deta hai aur cons ke andar new Integer(10) value pass kara deta  haiaur hi ke sath 
	 * concanate kr deta hai but yaha per 3 object banage ek hi,10 teesra hi10 ke liye banega*/
	System.out.println(s2);
	String s3=10+20+10+"hi"+1+1+1;// idhar overloaded hoga string bahaviour a jayega outpupt 40hi111
	System.out.println(s3);
	String s4=56+78+" ";
	System.out.println(s4);
}
}
