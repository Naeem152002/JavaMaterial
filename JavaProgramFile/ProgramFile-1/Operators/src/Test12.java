public class Test12 {
public static void main(String args[]) {
	int a=10;
	System.out.println(a++ + ++a);//22
	System.out.println(++a - a++);//0
	System.out.println(a-- + --a);//26
	System.out.println(--a - a--);//0
	
}
}

