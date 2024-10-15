<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.example.dto.UserDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1>
<%
UserDto dto=(UserDto)request.getAttribute("user");
%>

<form action="doEdit" method="post" >

<input type="hidden" name="id" value="<%=dto.getId()%>"/>
Name:<input type="text" name="name" value="<%=dto.getName()%>" required="required"/> <br>
Email:<input type="email" name="email" value="<%=dto.getEmail()%>" required="required"/><br>
Password:<input type="password" name="password" value="<%=dto.getPassword()%>" required="required"/><br>
Mobile:<input type="tel" name="mobile" value="<%=dto.getMobile()%>" required="required"/><br>



<input type="submit"  value="Update"/>



</form>
</body>
</html>