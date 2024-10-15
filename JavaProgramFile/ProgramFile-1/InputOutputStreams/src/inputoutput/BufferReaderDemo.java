package inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
InputStreamReader inputStreamReader =new InputStreamReader(System.in);
BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
System.out.println("enter your name");
String s=bufferedReader.readLine();
System.out.println(s);

		
		}
		
	}


