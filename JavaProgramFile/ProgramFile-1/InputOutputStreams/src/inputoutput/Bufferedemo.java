// file data nahi ayaa hai
package inputoutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;



public class Bufferedemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\classmyfile.txt");
     BufferedOutputStream buffered=new BufferedOutputStream(fileOutputStream);
		String s="my name is khan";
		byte b[]=s.getBytes();
		Timer.startTime();
		 buffered.write(b);
		Timer.endTime();
		System.out.println("Data stored is file.....");
		
		
		FileInputStream inputStream=new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\classmyfile.txt");
		 BufferedInputStream bufferedinut=new BufferedInputStream(inputStream);                                                                                                
		while(true) {
			
			int i= bufferedinut.read();
			if(i==-1)// -1 ka matlab hai end of file
				break;
			System.out.print((char)i);
		}
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
