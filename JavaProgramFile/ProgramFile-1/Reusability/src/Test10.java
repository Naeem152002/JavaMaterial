/* ek to ye hai aap realatin bana le ek dusre ke sath */
class N extends M{
	static {

	System.out.println("Loading  M is loaded");
}
}
class M{
	static {
		System.out.println("Loading N is loaded");
}
}
public class Test10 extends N{

static {
	System.out.println("Loading is loaded");
System.exit(0);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hi");
	}

}
