package com.preparedstatements;

import java.sql.*;  
public class Test{  
public static void main(String args[]){  
try{  
 
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
	System.out.println(c);
  
PreparedStatement stmt=c.prepareStatement("insert into emp1 values(?,?)");  
stmt.setInt(1,101);//1 specifies the first parameter in the query  
stmt.setString(2,"Ratan");  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
c.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  
