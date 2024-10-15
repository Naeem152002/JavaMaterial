package inputoutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

class PrintStreamDemo{
	
	public static void main(String args[]) {
		try {
            OutputStream outputStream=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\f5.txt");
		    PrintStream pw=new PrintStream(outputStream);
		    
		    pw.println("hello");    
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
