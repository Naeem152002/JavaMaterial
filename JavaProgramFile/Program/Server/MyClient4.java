import java.io.*;
import java.net.*;

public class MyClient4
{
Socket s;
DataInputStream din;
DataOutputStream dout;
public MyClient4()
{
try
{
s=new Socket("localhost",20);
//s=new Socket("192.168.1.10",20);
System.out.println(s);
din=new DataInputStream(s.getInputStream());
dout=new DataOutputStream(s.getOutputStream());
clientchat();
}catch(Exception e)
{
System.out.println(e);
}
}
public void clientchat() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1;
do
{
s1=br.readLine();
dout.writeUTF(s1);
System.out.println("Server Message:"+din.readUTF());

}while(!s1.equals("stop"));
}
public static void main(String a[])
{
new MyClient4();

}
}