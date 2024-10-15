public class Test9{
		public static void main(String []args) {
			int x[][]= {{2,6,6,9},{4,5,5,9},{3,5,3,9,8}};
			System.out.println(x.length);
			
			//System.out.println(x[1][0]);
			for (int i=0;i<x.length;i++) {
			for (int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		}	}

