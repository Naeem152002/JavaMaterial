package com.serversocket2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
	public static void main(String[]args) {
		try {
			Socket s=new Socket("localhost",20);
			System.out.println(s);
			OutputStream o=s.getOutputStream();
			DataOutputStream d=new DataOutputStream(o);
			String s1="My Name is naeem";
			d.writeUTF(s1);
			d.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
