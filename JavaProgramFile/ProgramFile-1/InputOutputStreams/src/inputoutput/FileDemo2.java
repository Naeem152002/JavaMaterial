//Read write data
package inputoutput;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;
public class FileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\JAVAmyfile.txt");
String s="My Naeem kuraishi";
	
byte b[]=s.getBytes(); 
for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
	fileOutputStream.write(b[i]);
}
System.out.println("data store in file......");
//fileOutputStream.write(b);// fileOutputStream main data write krnke liye hai write method byte type ka data leta
//hai
FileInputStream fileInputStream=new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\JAVAmyfile.txt");
while(true) {
	int i= fileInputStream.read();
	if(i==-1)// -1 ka matlab hai end of file
		break;
	System.out.print((char)i);
}

}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}