import java.net.*;
import java.io.*;

class MyServer1
{

public static void main(String ss[])
{

try
{
ServerSocket s=new ServerSocket(30);
System.out.println("server has started and waiting for client request..");
Socket sk=s.accept();
System.out.println(sk);
InputStream is=sk.getInputStream();
DataInputStream ds=new DataInputStream(is);
String st=(String)ds.readUTF();
System.out.println(st);

}
catch(Exception e)
{
System.out.println(e);
}

}

}