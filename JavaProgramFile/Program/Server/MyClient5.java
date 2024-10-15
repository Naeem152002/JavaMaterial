import java.io.*;
import java.net.*;
import java.util.*;

public class MyServer
{
ArrayList al=new ArrayList();
ServerSocket ss;
Socket s;
 
public MyServer()
{

try
{

ss=new ServerSocket(10);
while(true)
{
s=ss.accept();
al.add(s);
Runnable r=new MyThread(s,al);
Thread t=new Thread(r);
t.start();

}
}catch(Exception e){}
}



public static void main(String a[])
{

new MyServer();
}
}

class MyThread implements Runnable
{
Socket s;
ArrayList al;
DataInputStream din;

MyThread(Socket s,ArrayList al)
{
this.s=s;
this.al=al;
}

public void run()
{

String s1=" ";
try
{
DataInputStream din=new DataInputStream(s.getInputStream());
do
{
s1=din.readUTF();
System.out.println(s1);
if(!s1.equals("stop"))
telleveryone(s1);
else
{

DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF(s1);
dout.flush();

}}while(!s1.equals("stop"));
}catch(Exception e){System.out.println(e);}

}
public void telleveryone(String s1)
{

Iterator i=al.iterator();
while(i.hasNext())
{
try
{

Socket sc=(Socket)i.next();
DataOutputStream dout=new DataOutputStream(sc.getOutputStream());
dout.writeUTF(s1);
dout.flush();
System.out.println("clients");
}catch(Exception e)
{
System.out.println(e);
}
}
}
}