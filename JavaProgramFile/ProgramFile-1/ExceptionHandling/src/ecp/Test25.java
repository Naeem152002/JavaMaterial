// yadi apko checked lagan hai to ise program ki follow kro 
package ecp;
import java.io.IOException;
public class Test25 {
 static void show() throws IOException { // show ko call kr rahe ho to waha use laga throws Exception
System.out.println("show");
throw new IOException();
 }
 static void disp()throws IOException  {
	show();
	System.out.println("disp");
}
 static void rem()throws IOException  {
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



