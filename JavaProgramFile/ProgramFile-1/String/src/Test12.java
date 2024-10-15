
public class Test12 {
public static void main(String args[]) {
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	
	
	
	sb.append("aaaaaaaaaaaaaaaaaaa");
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	System.out.println(sb);
	
	sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	System.out.println(sb);
	
	StringBuffer sb1 =new StringBuffer(5);
	System.out.println(sb1.capacity());
	
	StringBuffer sb2 =new StringBuffer("hello");
	System.out.println(sb2.capacity());
}
}
