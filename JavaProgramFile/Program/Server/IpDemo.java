import java.net.*;
class IPDemo
{
public static void main(String g[])
{
try
{
InetAddress ip=InetAddress.getLocalHost();

System.out.println(ip);


InetAddress ip1=InetAddress.getByName("DESKTOP-I7J6NN2");
System.out.println(ip1);

System.out.println("Name of pc whose ip is "+ip+":"+ip.getHostName());

System.out.println("Address of pc whose ip is "+ip+":"+ip.getHostAddress());
}

catch(Exception e)
{
System.out.println(e);
}
}
}