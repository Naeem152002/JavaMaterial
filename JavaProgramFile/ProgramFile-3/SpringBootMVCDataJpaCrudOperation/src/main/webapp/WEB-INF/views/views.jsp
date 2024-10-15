<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.example.dto.UserDto" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.size{
font-size: 20px;
}
</style>
<body>
<h1>${msg}</h1>
<table border="1" class="size">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Mobile</th>
<th>Action</th>
</tr>
<%
List<UserDto>users=(List<UserDto>)request.getAttribute("users"); 
if(users!=null){
	for(UserDto data:users){
	%>
	<tr>
	<td><%=data.getId() %></td>
	<td><%=data.getName() %></td>
	<td><%=data.getEmail() %></td>
	<td><%=data.getPassword() %></td>
	<td><%=data.getMobile() %></td>
	<td>
	<a href="edit?id=<%=data.getId()%>">Edit</a>
	<a href="delete?id=<%=data.getId()%>">Delete</a>
	</td>
	</tr>
	
	
	<% 
	}
}
%>
</table>
</body>
</html>