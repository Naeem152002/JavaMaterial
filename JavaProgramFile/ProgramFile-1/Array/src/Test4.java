
	public class Test4 {
		static public void min(int arr[]) {
			int min= arr[0];
			for (int i=0;i<arr.length;i++) {
				if (min>arr[i] )
					min=arr[i];
				
			}
			System.out.println( "minimum element is"+min);
			
		}
		public static void main(String arg[]) {
			//min(new int [] {10,20,50,100,3,7});
			int x[]={10,50,89,26,98};
			min(x);
		}
		}


