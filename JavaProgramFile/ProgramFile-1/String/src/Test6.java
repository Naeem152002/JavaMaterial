
public class Test6 {
public static void main(String arg[]) {
	String s="surya";
	s.concat("tripathi");
	String s1="naeem";
	s1=s1.concat("kuraishi");
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s.hashCode());//hashcode ke pata chalta hai kis id hai yaha per surya ke liya hai
	 s=s.concat("tripathi");// ye concreate kr deti hai 
	System.out.println(s); // yaha pe 3 memory create  hoti hai ek surya ,tripathi and surya thripathi ;
	System.out.println(s.hashCode());// yaha per hashcode id suryatripathi ke liye hai 
}
}
