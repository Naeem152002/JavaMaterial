<%@page import="java.sql.Connection"%>
<%@page import="connection.dbConnectio"%>
<%@page import="dao.UserDaoImp"%>
<%@page import="bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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

Connection connection=dbConnectio.getConnection();
System.out.println(connection);

UserBean bean = new UserBean(fname,lname,gender,email,password,mobile);

UserDaoImp imp=new UserDaoImp();
String msg=imp.registerUser(bean);

if(msg.equalsIgnoreCase("S"))
{
out.println("Data Insert Sucessfully ....");	
}

if(msg.equalsIgnoreCase("F"))
{
out.println("Note Insert...");	
}


%>
</body>
</html>