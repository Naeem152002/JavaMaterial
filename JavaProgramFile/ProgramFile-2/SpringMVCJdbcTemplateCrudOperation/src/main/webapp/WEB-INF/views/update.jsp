<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.dto.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
User dto=(User) request.getAttribute("User");
%>
<form action="doUpdate" method="post">
               <input type="text" name="id" value="<%=dto.getId()%>" hidden="">
		Name <input type="text" name="name" value="<%=dto.getName()%>" required>
		<br>
		Email <input type="email" name="email" value="<%=dto.getEmail()%>" required>
		<br>
		Mobile <input type="tel" name="mobile" value="<%=dto.getMobile()%>" required>
		<br>
		Password <input type="password" name="password" value="<%=dto.getPassword()%>" required>
		<br>
		<input type="submit" value="Update">
	</form>	
</body>
</html>