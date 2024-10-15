<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%@page import="java.sql.*" %>

<%
String fname=request.getParameter("ufirst");
String lname=request.getParameter("ulast");
String gender=request.getParameter("gender");
String email=request.getParameter("uemail");
String password=request.getParameter("upass");
String mobile=request.getParameter("umobile");

out.println(fname);
out.println(lname);
out.println(gender);
out.println(email);
out.println(password);
out.println(mobile);




try
{
Class.forName("com.mysql.cj.jdbc.Driver");	
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdata","root","root123");
System.out.println(conn);
PreparedStatement ps=conn.prepareStatement("insert into student(FirstName,LastName,Gender,Email,Password,Mobile)values(?,?,?,?,?,?)");
ps.setString(1,fname);
ps.setString(2, lname);
ps.setString(3, gender);
ps.setString(4, email);
ps.setString(5, password);
ps.setString(6, mobile);


int x=ps.executeUpdate();
if(x>0)
{
out.println("Register Sucessfully");
}


}

catch(Exception e)
{
	out.println(e);
}

%>
</body>
</html>