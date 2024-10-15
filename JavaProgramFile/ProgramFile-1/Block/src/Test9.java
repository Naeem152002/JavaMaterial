
public class Test9 {
static {
	System.out.println("static block");
}
{
	System.out.println("init block");
}
public static void main(String args[]) {
	new Test9();
	System.out.println("main");
}
}
