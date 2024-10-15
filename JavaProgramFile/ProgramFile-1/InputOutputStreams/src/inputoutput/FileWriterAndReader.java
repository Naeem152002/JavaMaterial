package inputoutput;

import java.io.FileReader;
import java.io.FileWriter;



public class FileWriterAndReader {

	public static void main(String[] args) {
		try {
			FileWriter filewriter=new FileWriter("C:\\Users\\naeem\\OneDrive\\Desktop\\f7.txt");
     String s="my name is khan";
     filewriter.write(s);
		System.out.println("Data stored is file.....");
		filewriter.close();
		
		FileReader fileInputStream=new FileReader("C:\\Users\\naeem\\OneDrive\\Desktop\\f7.txt");
		                                                                                                 
		while(true) {
			
			int i= fileInputStream.read();
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
