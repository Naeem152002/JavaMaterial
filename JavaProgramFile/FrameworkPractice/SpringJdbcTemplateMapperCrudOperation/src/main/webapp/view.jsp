<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
    <%@ page import="org.springframework.context.ApplicationContext" %>
    <%@ page import="com.dao.UserDao" %>
    <%@ page import="com.dto.User" %>
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
ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
UserDao dao=(UserDao)app.getBean("dao");
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