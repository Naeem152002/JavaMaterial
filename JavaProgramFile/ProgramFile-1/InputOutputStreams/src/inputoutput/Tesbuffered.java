// file data aya jayega flush karad
package inputoutput;

import java.io.BufferedInputStream;
//Network liye ye do method chalta hai :flush,cluse;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class Tesbuffered {

	public static void main(String[] args) {
		BufferedOutputStream buffered=null;//local varriable ki intilization krna zaroori hota hai 
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\classmyfile.txt");
             buffered= new BufferedOutputStream(fileOutputStream);
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
		}finally {
			try {
				buffered.flush();//data file main pahucha nahi to flush dabao
				buffered.close();
			}
			catch(IOException e	) {
				e.printStackTrace();
			}
		}
		
		// TODO Auto-generated method stub

	}

}
