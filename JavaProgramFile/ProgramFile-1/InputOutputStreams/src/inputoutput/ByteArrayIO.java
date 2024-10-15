package inputoutput;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class ByteArrayIO {

	public static void main(String[] args) {
		try {
			ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
		FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\classmyfile.txt");
       String s=JOptionPane.showInputDialog(null, "enter your txt");// use spring user se lene ka tarika 
		byte b[]=s.getBytes();
		Timer.startTime();
		 byteArrayOutputStream.write(b);
		byteArrayOutputStream.writeTo(fileOutputStream);
		//byteArrayOutputStream.writeTo(fileOutputStream);
		Timer.endTime();
		System.out.println("Data stored is file.....");
		byte ba[]=byteArrayOutputStream.toByteArray();
		ByteArrayInputStream bInputStream=new ByteArrayInputStream(ba);
		 
		                                                                                                
		while(true) {
			int i= bInputStream.read();
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
