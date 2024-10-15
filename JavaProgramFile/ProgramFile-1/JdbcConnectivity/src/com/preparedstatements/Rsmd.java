package com.preparedstatements;

import java.sql.*;  
public class Rsmd{  
public static void main(String args[]){  
try{    
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
	System.out.println(c);
   
PreparedStatement ps=c.prepareStatement("select * from emp1");  
ResultSet rs=ps.executeQuery();  
ResultSetMetaData rsmd=rs.getMetaData();  
  
System.out.println("Total columns: "+rsmd.getColumnCount());  
System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
  
//DatabaseMetaData
DatabaseMetaData dbmd=c.getMetaData();  

System.out.println("Driver Name: "+dbmd.getDriverName());  
System.out.println("Driver Version: "+dbmd.getDriverVersion());  
System.out.println("UserName: "+dbmd.getUserName());  
System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
  

c.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
