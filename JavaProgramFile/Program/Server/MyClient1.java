 import java.net.*;
import java.io.*;

class MyClient1
{

public static void main(String ss[])
{

try
{
Socket s=new Socket("localhost",30);
System.out.println(s);
OutputStream os=s.getOutputStream();
DataOutputStream ds=new DataOutputStream(os);
ds.writeUTF("How are you Gufran khan");
ds.close();
}
catch(Exception e)
{
System.out.println(e);
}

}

}