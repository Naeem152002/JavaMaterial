package com.serversocket1;

import java.io.IOException;
import java.net.Socket;

public class MyClient {
	
	public static void main(String[]args) {
		
		Socket s;
		try {
			s = new Socket("localhost",10);
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
