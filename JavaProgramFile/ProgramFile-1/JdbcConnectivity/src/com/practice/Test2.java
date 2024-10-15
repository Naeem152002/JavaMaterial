package com.practice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Test2 {
	public static void main(String[]args) {
		try {
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
			System.out.println(c);
			PreparedStatement stmt=c.prepareStatement("insert into student values(?,?,?,?,?)"); 
			stmt.setInt(1, 37);
			stmt.setString(2, "Rhoit");
			stmt.setString(3, "94");
			stmt.setString(4, "89e");
			stmt.setString(5, "Agra");
			int i=stmt.executeUpdate();
			if(i>0) {
			System.out.println("data Inserted");
			}
			else {
				System.out.println("data not inserted");
			}
			c.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}


