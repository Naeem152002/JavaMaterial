package com.jdbc;


import java.sql.*;  
class JdbcDemo2{  
public static void main(String args[])throws Exception{   
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
	System.out.println(c);
	Statement s=c.createStatement(); 
  
//stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");  
//int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  
int result=s.executeUpdate("delete from student where rollno=101");  
System.out.println(result+" records affected");  
c.close();  
}}  