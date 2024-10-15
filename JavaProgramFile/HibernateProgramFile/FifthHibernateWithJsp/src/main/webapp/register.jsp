<%@page import="com.fifthhibernaewithjsp.dao.UserDao" %>
<%@page import="com.fifthhibernaewithjsp.entities.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<%@page %>
</head>
<body>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String password=request.getParameter("password");
String mobile=request.getParameter("mobile");

User user1=new User(name,email,password,mobile);
boolean check1=UserDao.userRegister(user1);

if(check1){
	out.println("<h1>Register Sucessfully</h1>");
	%>
	<jsp:include page="login.html"></jsp:include>
	<%
}
	
	%>
</body>
</html>