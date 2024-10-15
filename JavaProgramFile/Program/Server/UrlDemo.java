import java.net.*;
import java.io.*;
class UrlDemo
{
public static void main(String g[])
{
try
{

URL u=new URL("https://www.facebook.com");
//URL u=new URL("http://uptu.ac.in/results/results_even_10_11.htm");

URLConnection con=u.openConnection();
InputStream in=con.getInputStream();
FileOutputStream fout=new FileOutputStream("ram.html");
while(true)
{
int i=in.read();
if(i==-1)
break;
System.out.print((char)i);
fout.write((char)i);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}