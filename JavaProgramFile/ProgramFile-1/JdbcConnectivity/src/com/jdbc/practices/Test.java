package com.jdbc.practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {
	
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
				String qurey="insert into user(name,email,password,mobile)values"
						+ "('"+dto.getName()+"','"+dto.getEmail()+"','"+dto.getPassword()+"','"+dto.getMobile()+"')";
				int i=s.executeUpdate(qurey);
				if(i>0) {
					System.out.println("data inserted");
				}else {
					System.out.println("data not inserted");
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
