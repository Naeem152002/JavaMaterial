// Static class loading 
class X{
	static int x=10;
	static {

	System.out.println("Loading  M is loaded");
}
}
class Y{
	static {
		System.out.println("Loading N is loaded");
}
}
public class Test11{

static {
	X n=new X();
	Y m=new Y();
	System.out.println("Loading is loaded");
	System.out.println(X.x);
System.exit(0);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hi");
	}

}
