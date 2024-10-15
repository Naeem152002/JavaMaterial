<%@page import="com.fifthhibernaewithjsp.dao.FetchDao" %>
<%@page import="com.fifthhibernaewithjsp.entities.User" %>
<%@page import="java.util.List"%>
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
User dto=FetchDao.fetchById(id);
%>
<form action="update.jsp" method="post">
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