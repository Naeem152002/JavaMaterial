public class Test13 {
public static void main(String args[]) {
	int a=10;
	System.out.println(a++ + ++a + --a+a--);//10+12+11+11=44
	System.out.println(a++ - ++a + --a + a--);//10-12+11+11==20
	
	
}
}
