package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public static void main(String[]args) {
		try {
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
			System.out.println(c);
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select*from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+rs.getString(4)+"  "+rs.getString(5)); 
			}
			c.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
