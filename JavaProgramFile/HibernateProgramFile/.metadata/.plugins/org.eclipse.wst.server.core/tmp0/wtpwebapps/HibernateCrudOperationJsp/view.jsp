<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.dto.User" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.size{
font-size: 20px;
}

</style>
</head>
<body>
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
UserDao dao=new UserDaoImpl();
List<User>users=dao.getAllUsers();
if(users!=null){
	for(User dto:users){
%>
<tr>
<td><%=dto.getId() %></td>

<td><%=dto.getName() %></td>

<td><%=dto.getEmail() %></td>

<td><%=dto.getPassword() %></td>

<td><%=dto.getMobile() %></td>

<td>
<a href="edit.jsp?id=<%=dto.getId()%>">Edit</a>
<a href="delete.jsp?id=<%=dto.getId()%>">Delete</a>

</td>

</tr>
<% 

	}}
%>

</table>

</body>
</html>