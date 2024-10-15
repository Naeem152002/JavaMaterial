//data ke sath bhejna ho
package com.jdbc;

import java.sql.*;
public class JdbcDemo
{
public static void main(String ss[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
System.out.println(c);
Statement s=c.createStatement();

String query= "insert into student(rollno,name,marks,grade,city)values(102,'anil',78,'C','Delhi')";

int i=s.executeUpdate(query);
if(i>0)
System.out.println("data inserteddd...");
else
System.out.println("data Not inserteddd...");

}
catch(Exception e)
{
System.out.println(e);
}

}

}

