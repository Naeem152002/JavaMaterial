// jab constructor same constructor aur diffrent parameters use kiya jata to use overloading kahte
package constructor;

public class Test1 {
Test1(){this (24);
	System.out.println("a cosntru....");
}
Test1(int x){
	this(34,56);
System.out.println(x);	
}
Test1(int x,int y){
	this("city",55);
	System.out.println(x);
	System.out.println( y);
}
Test1(String city ,int z){
	System.out.println(city);
	System.out.println(z);
	
}
public static void main(String naeem []) {

	new Test1();
	/*new Test1(2);
	new Test1(2,5);
	new Test1("city",7);*/
}
}