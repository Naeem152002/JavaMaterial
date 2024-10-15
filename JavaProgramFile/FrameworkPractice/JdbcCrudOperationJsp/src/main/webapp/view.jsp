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
<style >
.size{
font-size:20px; 
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
	for(User data:users){
%>		
<tr>
<td><%=data.getId() %></td>
<td><%=data.getName() %></td>
<td><%=data.getEmail() %></td>
<td><%=data.getPassword() %></td>
<td><%=data.getMobile() %></td>
<td>
<a href="edit.jsp?id=<%=data.getId()%>">Edit</a>
<a href="delete.jsp?id=<%=data.getId()%>">Delete</a>
</td>
</tr>		
		
<%		
}
}

%>





</table>
</body>
</html>