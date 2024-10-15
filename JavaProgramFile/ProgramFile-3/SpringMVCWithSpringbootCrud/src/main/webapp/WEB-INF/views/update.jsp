<%@page import="com.androjava.mvc.dto.UserDto"%>
<%@page import="com.androjava.mvc.entities.User"%>
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
UserDto dto=(UserDto) request.getAttribute("UserDto");
%>
<form action="doedit" method="post">
               <input type="text" name="id" value="<%=dto.getId()%>" hidden="">
		Name <input type="text" name="name" value="<%=dto.getName()%>" required>
		<br>
		Email <input type="email" name="email" value="<%=dto.getEmail()%>" required>
		<br>
		Mobile <input type="tel" name="mobile" value="<%=dto.getMobile()%>" required>
		<br>
		Password <input type="password" name="pass" value="<%=dto.getPass()%>" required>
		<br>
		<input type="submit" value="Update">
	</form>	
</body>
</html>