package com.practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
				System.out.println(c);
				Statement s=c.createStatement();
				
				String query="insert into user (id,name,email,password,mobile)values(3,'Rohit','rohit','393939','8393')";
			int i=s.executeUpdate(query);
			if(i>0) {
				System.out.println("Data inserted");
			}else {
				System.out.println("Data not inserted");
			}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}