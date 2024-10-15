
public class Test11 {
public static void main(String arg[]) {
	String s="hello how are you";
	String s1=s.substring(2);//0 start inclusive
	System.out.println(s1);
	String s5=s.substring(3,8);//0 start// 1 start
	System.out.println(s5);
	
	
	String st[]=s.split("h");
	for (String sp:st)
		System.out.println(sp);
	
	byte b[]=s.getBytes();// unicode value  
	for(byte sp1:b)
		System.out.println(sp1);
}
}
