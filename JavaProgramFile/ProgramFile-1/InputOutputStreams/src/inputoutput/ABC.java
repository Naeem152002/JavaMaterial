package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ABC {
	
	public static void main(String[]args) throws IOException {
		
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\Iopractice\\io.txt");
			FileOutputStream f1=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\Iopractice\\io.txt");
			String s="my naeem kuraishi";
			byte[]b=s.getBytes();
			f1.write(b);
			while(true) {
				int i=f.read();
			if(i==-1) 
				break;
			//f1.write(i);
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
