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
if(!session.isNew()) {	
out.println("<h1><a href='logout.jsp'>LogOut</a><h1>");
out.println("<h1><a href='view.jsp'>View</a><h1>");
}
else {
	%>
	<jsp:include page="login.html"></jsp:include>
	<%
}
%>
</body>
</html>