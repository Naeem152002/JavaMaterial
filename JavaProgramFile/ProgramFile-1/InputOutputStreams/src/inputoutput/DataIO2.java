package inputoutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class DataIO2 {
	public static void main (String args[]) {
		
		try
		{
			FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\f3.txt");
		    DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream);
		    dataOutputStream.writeInt(99);
		    dataOutputStream.writeFloat(97.7f);
		    dataOutputStream.writeChar('d');
		    
		    
		    
		    
		    InputStream fileInputStream1=new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\f3.txt");
			DataInputStream dataInputStream1=new DataInputStream(fileInputStream1);
			
			int i1= dataInputStream1.readInt();
			  float i2 = dataInputStream1.readFloat();
			    char i3=dataInputStream1.readChar();
			    System.out.println(i1);
			    System.out.println(i2);
			    System.out.println(i3);
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}