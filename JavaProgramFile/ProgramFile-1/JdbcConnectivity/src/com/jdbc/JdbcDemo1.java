//without data
package com.jdbc;

import java.sql.*;  
class JdbcDemo1{  
public static void main(String args[]){  
try{    
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
	System.out.println(c);
	Statement s=c.createStatement(); 
ResultSet rs=s.executeQuery("select * from user");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+rs.getString(4)+"  "+rs.getString(5));  
//c.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
