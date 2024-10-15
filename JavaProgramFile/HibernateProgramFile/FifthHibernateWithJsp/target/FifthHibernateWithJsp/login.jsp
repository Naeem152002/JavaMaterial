<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.fifthhibernaewithjsp.dao.UserDao" %>
<%@page import="com.fifthhibernaewithjsp.factoryprovider.FactoryProvider" %>
<%@page import="com.fifthhibernaewithjsp.entities.User" %>
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
String userEmail = request.getParameter("email");
String userPassword = request.getParameter("password");
System.out.println(userEmail);
System.out.println(userPassword);

User user=new User(userEmail,userPassword);
 boolean check=UserDao.getUserByEmailAndPassword(user);
if(!check) {
out.println("<h1>invalid details</h1>");
%>
<jsp:include page="login.html"></jsp:include>
<%
}else {
	session.setAttribute("email", user.getEmail());
	session.setAttribute("password", user.getPassword());
	%>
	<jsp:forward page="welcome.jsp"></jsp:forward>
	<%
}
%>
</body>
</html>