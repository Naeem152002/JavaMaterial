package com.practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
				System.out.println(c);
				Statement s=c.createStatement();
				
				String query="select*from user";
				ResultSet set=s.executeQuery(query);

			while(set.next()) {
				System.out.println(set.getInt(1));
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
