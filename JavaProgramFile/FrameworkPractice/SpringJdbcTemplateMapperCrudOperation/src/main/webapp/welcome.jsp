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
String name=(String)session.getAttribute("name");
String email=(String)session.getAttribute("email");
if(!session.isNew()){
	out.println("<h2>Login Successfully</h2>");
	out.println("Name:"+name+"Email:"+email+"<h2><a href='logout.jsp'>LogOut</a></h2>");
	out.println("<h2><a href='view.jsp'>View</a></h2>");
	}else{
		%>
		<jsp:forward page="login.html"></jsp:forward>
		<% 
	}

%>
</body>
</html>