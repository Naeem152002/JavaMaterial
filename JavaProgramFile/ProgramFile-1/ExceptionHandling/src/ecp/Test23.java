package ecp;
public class Test23 {
 static void show() { // suddenly apke program mai problem a jaye 
System.out.println("show");
try {
int x=10/0;
}catch (Exception e) {
	//System.out.println(e);ye only exception dikhayega 
	e.printStackTrace();// ye pura dekhayega 
}
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
	 rem();
	 System.out.println("normal code...");
 }
}
