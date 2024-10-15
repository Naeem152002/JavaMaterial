package cmdarg;

public class Test2 {

	public static void main(String[] args) {
//		int y=10;
//		Integer r=y;
//		int n=r.intValue();
		// TODO Auto-generated method stub
int x=10;
System.out.println(x);
//Integer i=new Integer(x);// boxing ... primitive data ko object mai badal deta hai 
// kai age hai  cheeze jaha per hume object main bdalana padega 
Integer i=10;
System.out.println(i);
int p=i.intValue();
System.out.println(p);// unboxing...ye object ko primitive ko object mai badal deta hai
Integer ii=x;//autoboxing jdk 1.5 mai rule aya hai
int y=ii;
System.out.println(ii==y);
System.out.println(y);



}



	
}
