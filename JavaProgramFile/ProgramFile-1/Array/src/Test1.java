// implicit method
public class Test1 {
public static void main (String args[]) {
	int x[]= new int[10];// int type ka array 
	System.out.println(x.length);// usi ke length batatyega//It indeicate of length of array
	x[0]=10;
	x[1]=10;
	x[8]=20;
	x[9]=20;
	//System.out.println(x[9]);
	for (int i=0;i<x.length;i++)
	System.out.println(x[i]);
}

}