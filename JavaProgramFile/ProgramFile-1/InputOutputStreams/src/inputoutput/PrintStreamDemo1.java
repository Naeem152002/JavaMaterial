package inputoutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

class PrintStreamDemo1{
	
	public static void main(String args[]) {
		try {
            OutputStream outputStream=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\f6.txt");
		    PrintStream pw=new PrintStream(outputStream);
		    System.setOut(pw);//console ke bahar print karna hai
		    System.out.println("hello");
		    System.out.println("hi");
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
//console per nahi dikhega             