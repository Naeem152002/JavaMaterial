// ek line hi print karke dega 
package inputoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DataIO {
	public static void main (String args[]) {
		
		try
		{InputStream fileInputStream=new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\f3.txt");
		DataInputStream dataInputStream=new DataInputStream(fileInputStream);
		
		
		String i=dataInputStream.readLine();
	
				System.out.println(i);
		}
	catch(Exception e) {
		e.printStackTrace();
	}

}}
