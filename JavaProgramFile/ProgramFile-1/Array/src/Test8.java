
public class Test8 {
public static void main(String []args) {
	int x[][]=new int[3][3];
	x[0][0]=2;
	x[0][1]=2;
	x[0][2]=4;
	x[1][0]=4;
	x[1][1]=2;
	x[1][2]=4;
	x[2][0]=4;
	x[2][1]=2;
	x[2][2]=4;
	System.out.println(x[0][2]);
	for (int i=0;i<x.length;i++) {
	for (int j=0;j<x.length;j++) {
		System.out.print(x[i][j]+" ");
	}
	System.out.println();
}
}
}