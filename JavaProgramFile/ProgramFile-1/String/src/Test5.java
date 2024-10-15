
public class Test5 {
	public static void main(String arg[]) {
		String s1="hello";
String s4=new String ("hello");
String s5=new String("hello");
System.out.println(s4);
System.out.println(s5);
System.out.println(s4==s5);
String s6=s4.intern();// intern method se pool area milati hai: ye method se object pool wala milega 
System.out.println(s1==s6);// ise banane per pool mai memory meilegi
}
}