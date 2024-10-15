import java.io.*;
import java.net.*;

public class MyServer4
{
ServerSocket ss;
Socket s;
DataInputStream dis;
DataOutputStream dos;
public MyServer4()
{
try
{
System.out.println("Server started");
 
ss=new ServerSocket(20);
 
s=ss.accept();
System.out.println(s);
System.out.println("client connected"); 
dis=new DataInputStream(s.getInputStream());
dos=new DataOutputStream(s.getOutputStream());
serverchat();
}catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String a[])
{
new MyServer4();
}


public void serverchat() throws IOException
{
String str;
do
{
str=dis.readUTF();
System.out.println("client message:"+str);
dos.writeUTF("hello"+str);
dos.flush();

}while(!str.equals("stop"));
}
}