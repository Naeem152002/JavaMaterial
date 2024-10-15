<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.fifthhibernaewithjsp.dao.FetchDao" %>
<%@page import="java.util.List"%>
<%@page import="com.fifthhibernaewithjsp.entities.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" class="font-size:20px;">
  <tr>
  	<th>id</th>
    <th>name</th>
    <th>email</th>
    <th>password</th>
    <th>mobile</th>
     <th>action</th> 
  </tr>
  <%
  List list=FetchDao.fetch();
  for(int i=0;i<list.size();i++){
	  User dtoData=(User)list.get(i);
  %>
  <tr>
  	<td> <%=dtoData.getId() %></td>
    <td> <%=dtoData.getName() %></td>
    <td> <%=dtoData.getEmail() %></td>
     <td> <%=dtoData.getPassword()%></td>
     <td> <%=dtoData.getMobile() %></td>
  <td> <a href="edit.jsp?id=<%= dtoData.getId()%>">Edit</a> 
<a href="delete.jsp?id=<%= dtoData.getId()%>">Delete</a>      
      </td>
  </tr>
  <%} %>
</table>

</body>
</html>
