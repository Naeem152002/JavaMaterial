// isme loop chalega jis se jitani line hai print ho jayegi  
package inputoutput;

import java.io.FileInputStream;
import java.io.InputStream;

public class DataIO1 {
	public static void main (String args[]) {
		
		try (InputStream fileInputStream = new FileInputStream("f3.txt"))
		{//DataInputStream dataInputStream=new DataInputStream(fileInputStream);
		fileInputStream.read();
		/*String s=" ";
		while(true) {
		s=dataInputStream.readLine();
			if(s!=null)
				System.out.println(s);
	}
		}*/
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}
}
