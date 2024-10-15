package com.jdbc.practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Test1 {
	
	public static void main(String[]args) {
		User dto=new User();
		dto.setName("Bhai");
		dto.setEmail("naeemkuraishi@gmail.com");
		dto.setPassword("89990");
		dto.setMobile("987654328");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
				Statement s=c.createStatement();
				String qurey="select*from user";
				ResultSet set=s.executeQuery(qurey);
				while(set.next()) {
					List<User>list=new ArrayList<User>();
					User u=new User();
					u.setId(set.getInt(1));
					u.setName(set.getString(2));
					u.setEmail(set.getString(3));
					u.setPassword(set.getString(4));
					u.setMobile(set.getString(5));
					list.add(u);
					System.out.println(list);
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
