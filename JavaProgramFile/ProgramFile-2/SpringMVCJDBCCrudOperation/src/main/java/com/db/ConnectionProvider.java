package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection connection;
	
	private ConnectionProvider() {
		
	}
	
	public static Connection getConnectionProvider() {
		try {
			if(connection==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/springframework", "root", "1234");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return connection;
		
	}
	public static void main(String[]args) {
		System.out.println(getConnectionProvider());
	}

}
