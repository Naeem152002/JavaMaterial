<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.example.dto.UserDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1>
<%
UserDto userDto=(UserDto)request.getAttribute("userDto");
%>
<form action="doEdit" method="post">
<input type="hidden" name="id" value="<%=userDto.getId() %>"   />
Name:<input  type="text" name="name" value="<%=userDto.getName()%>" required="required"/><br>
Email:<input  type="email" name="email" value="<%=userDto.getEmail()%>" required="required"/><br>
Password:<input  type="password" name="password" value="<%=userDto.getPassword()%>" required="required"/><br>
Mobile:<input  type="tel" name="mobile" value="<%=userDto.getMobile()%>" required="required"/><br>

<input  type="submit" value="Update"/>

</form>
</body>
</html>