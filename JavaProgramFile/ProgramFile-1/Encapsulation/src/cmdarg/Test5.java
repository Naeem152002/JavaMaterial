package cmdarg;

public class Test5 {
static void show(int ...x) {
	//for (int i=0;i<x.length;i++) 
	for (int i:x)
		System.out.println(x[i]);
	}
	public static void main(String []args) {
		
		show(10);
		show();
		show(10,50);
		show(10,50,345);
	
}
}