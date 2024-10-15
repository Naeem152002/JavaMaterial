<%@page import="java.util.List"%>
<%@page import="dto.UserDto"%>
<%@page import="dao.FetchDao"%>
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
FetchDao dao=new FetchDao();
int id=Integer.parseInt(request.getParameter("id"));
UserDto dto=dao.fetchById(id);
%>
<form action="UpdateJsp.jsp" method="post">
		<input type="number" value=<%=dto.getId()%> name="id" hidden="true" >
		Name <input type="text" value=<%=dto.getName()%> name="name" required>
		<br>
		Email <input type="email" value=<%=dto.getEmail()%> name="email" required>
		<br>
		Mobile <input type="tel" value=<%=dto.getMobile() %> name="mobile" required>
		<br>
		Password <input type="password" value=<%=dto.getPassword() %> name="password" required>
		<br>
		<input type="submit" value="Update">
		<a href="LoginPage.html">Login</a>
	</form>	
</body>
</html>