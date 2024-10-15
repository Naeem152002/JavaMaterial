package inputoutput;

import java.io.FileReader;
import java.io.FileWriter;



public class FileWriterReader1 {

	public static void main(String[] args) {
		try {
			FileWriter filewriter=new FileWriter("C:\\Users\\naeem\\OneDrive\\Desktop\\f8.txt");
     String s="my name is khan";
     char ch[]=s.toCharArray();
     filewriter.write(ch);
		System.out.println("Data stored is file.....");
		filewriter.close();
		
		FileReader fileInputStream1=new FileReader("C:\\Users\\naeem\\OneDrive\\Desktop\\f8.txt");
		                                                                                                 
		while(true) {
			
			int i= fileInputStream1.read();
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

	private static char[] toCharArray() {
		// TODO Auto-generated method stub
		return null;
	}

}
