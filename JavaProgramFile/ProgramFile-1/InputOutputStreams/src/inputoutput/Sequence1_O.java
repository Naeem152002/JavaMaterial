//sequnce data read karna hai do se jada ke liye hai sequnce main aur write kiya p file main sara data ye bhi
// kr sakate hai
package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Sequence1_O {
	public static void main(String args[]) {
		
	try {
		FileInputStream fileInputStream1=new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\f1.txt");
		FileInputStream fileInputStream2=new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\f2.txt");
		FileInputStream fileInputStream3=new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\main.java");
       FileInputStream fileInputStream4=new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\Test.java");
       
       FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\p.txt");
		Vector v=new Vector();
		v.addElement(fileInputStream1);
		v.addElement(fileInputStream2);
		v.addElement(fileInputStream3);
		v.addElement(fileInputStream4);
		
		Enumeration e=v.elements();
		
		
		SequenceInputStream sequenceInputStream=new SequenceInputStream(e);
	while(true) {
		
		int i=sequenceInputStream.read(); 
		if(i==-1)// -1 ka matlab hai end of file
			break;
		System.out.print((char)i);
		fileOutputStream.write(i);
	}}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}