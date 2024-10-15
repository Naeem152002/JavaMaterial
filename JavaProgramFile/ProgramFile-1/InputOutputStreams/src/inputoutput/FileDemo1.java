//write data true:append krta hai kiya hai and false:oveeride karta hai (ek value ko baar baar print nahi krega)
//imagine karo
package inputoutput;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\apnacollegemyfile.txt",true);
String s="My Naeem kuraishi";
byte b[]=s.getBytes(); 
for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
	fileOutputStream.write(b[i]);
}
System.out.println("data store in file......");
//fileOutputStream.write(b);// fileOutputStream main data write krnke liye hai write method byte type ka data leta
//hai
}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}