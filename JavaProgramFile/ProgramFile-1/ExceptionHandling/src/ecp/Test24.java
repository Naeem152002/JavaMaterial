// Propgation :exception top per hai aur try catch hadle ke liye bottom per lagaye to use propagattion kahate 
// ye exception unchecked ke liye hoti hai
package ecp;
public class Test24 {
 static void show() {
System.out.println("show");
int x=10/0;
 }
 static void disp() {
	show();
	System.out.println("disp");
}
 static void rem() {
	disp();
	System.out.println("rem");
}
 public static void main(String [] args) {
	try {
		rem();
	}catch (Exception e) {
		e.printStackTrace();
	}
	 System.out.println("normal code...");
 }
}


