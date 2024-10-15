package com.serversocket2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[]args) {
		try {
			ServerSocket s=new ServerSocket(20);
			System.out.println(s);
			Socket sk=s.accept();
			InputStream in=sk.getInputStream();
			DataInputStream d=new DataInputStream(in);
			String st=(String)d.readUTF();
			System.out.println(st);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
