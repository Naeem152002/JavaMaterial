package com.preparedstatements;

import java.sql.*;  
import java.io.*;  
class Test1{  
public static void main(String args[])throws Exception{   
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
	System.out.println(c);
   
  
PreparedStatement ps=c.prepareStatement("insert into emp2 values(?,?,?)");  
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
do{  
System.out.println("enter id:");  
int id=Integer.parseInt(br.readLine());  
System.out.println("enter name:");  
String name=br.readLine();  
System.out.println("enter salary:");  
float salary=Float.parseFloat(br.readLine());  
  
ps.setInt(1,id);  
ps.setString(2,name);  
ps.setFloat(3,salary);  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
  
System.out.println("Do you want to continue: y/n");  
String s=br.readLine();  
if(s.startsWith("n")){  
break;  
}  
}while(true);  
  
c.close();  
}}  
