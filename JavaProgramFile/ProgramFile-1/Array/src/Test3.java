
// maximum element 
public class Test3 {
static public void max(int arr[]) {
	int max= arr[0];
	for (int i=0;i<arr.length;i++) {
		if (max<arr[i] )
			max=arr[i];
		
	}
	System.out.println("maximum element is"+max);
	
}
public static void main(String arg[]) {
	max(new int [] {10,20,50,100,3,7});
}
}
