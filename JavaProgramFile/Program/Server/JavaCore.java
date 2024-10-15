package p;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class JavaCore 
{
 
	 public static void main(String[] args) throws IOException {
		
		  URL url=new URL("https://www.facebook.com"); 
		  System.out.println(url.getDefaultPort());
		  System.out.println(url.getHost());
		  System.out.println(url.getAuthority());
		  
		  URLConnection openConnection = url.openConnection();
		   
		  

		  
		  
		 
		 
	}
	
	 
	
}










