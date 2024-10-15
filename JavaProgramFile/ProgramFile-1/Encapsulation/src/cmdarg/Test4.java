// varraible length argument: same type ki value ke liye banata hai aur method overrding single se karate hai.
package cmdarg;

public class Test4 {
static void show(int ...x) {
	for (int i=0;i<x.length;i++) 
	
		System.out.println(x[i]);
	}
	public static void main(String []args) {
		show(10);
		show(10,20);
		show();
		show(10,50,345);
	
}
}
