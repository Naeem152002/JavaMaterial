// isme only ek chalegi kyuki inme koi realtion nahi hai
class A{
	static {

	System.out.println("Loading A is loaded");
}
}
class E{
	static {
		System.out.println("Loading E is loaded");
}
}
public class LoadingTest {

static {
	System.out.println("Loading is loaded");
System.exit(0);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hi");
	}

}
