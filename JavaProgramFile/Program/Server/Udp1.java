import java.io.*;
import java.net.*;
class udp1
{
public static void main(String a[])throws IOException
{
DatagramSocket ds=new DatagramSocket();
String s="India is a good country";
byte b[]=s.getBytes();
DatagramPacket dp=new DatagramPacket(b,(b.length),InetAddress.getLocalHost(),8);
ds.send(dp);
}}















//it connectionless there is no any need of connection stablished and it is //not reliable becase it does not send any ackonowledege;