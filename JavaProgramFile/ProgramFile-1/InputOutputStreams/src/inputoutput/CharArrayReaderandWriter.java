package inputoutput;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;


public class CharArrayReaderandWriter {

	public static void main(String[] args)throws Exception{
		CharArrayWriter charArrayWriteR=new CharArrayWriter();
			FileWriter filewriter1=new FileWriter("C:\\Users\\naeem\\OneDrive\\Desktop\\f9.txt");
			FileWriter filewriter2=new FileWriter("C:\\Users\\naeem\\OneDrive\\Desktop\\html.txt");
			FileWriter filewriter3=new FileWriter("C:\\Users\\naeem\\OneDrive\\Desktop\\file2.pdf");
			
			String s="my name is khan";
			charArrayWriteR .write(s);
			charArrayWriteR.writeTo(filewriter1);
			charArrayWriteR.writeTo(filewriter2);
			charArrayWriteR.writeTo(filewriter3);
			
			
     char ch[]=s.toCharArray();
    filewriter1.close();
    filewriter2.close();
    filewriter3.close();
    charArrayWriteR.close();
    
    
		CharArrayReader arrayReader=new CharArrayReader(charArrayWriteR.toCharArray());
		System.out.println(arrayReader.toString());
		                                                                                                 
	}}