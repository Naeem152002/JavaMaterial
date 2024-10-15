//write data 
package inputoutput;
import java.io.FileOutputStream;
public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\Iopractice\\io.txt");
String s="My Naeem kuraishi";
byte b[]=s.getBytes(); 
if(b!=null) {
fileOutputStream.write(b);
System.out.println("successfully data inserted");
}// fileOutputStream main data write krnke liye hai write method byte type ka data leta
//hai
}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
