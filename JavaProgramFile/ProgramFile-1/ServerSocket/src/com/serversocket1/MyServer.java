package com.serversocket1;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	public static void main(String[]args) {
		try {
		ServerSocket s=new ServerSocket(10);
		System.out.println("server has started waiting client request");
		Socket sk=s.accept();
		System.out.println(sk);
	}catch(Exception e) {
		e.printStackTrace();
	}

}}