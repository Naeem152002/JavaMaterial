import java.io.*;
import java.net.*;
class udp2
{
public static void main(String a[])throws IOException
{
DatagramSocket ds=new DatagramSocket(8); 
byte b[]=new byte[1024];
DatagramPacket dp=new DatagramPacket(b,b.length);
ds.receive(dp);
String r=new String(dp.getData());
System.out.println(r.trim());
}}
