<%@page import="dao.FetchDao"%>
<%@page import="dto.UserDto"%>
<%@page import="java.util.List"%>
<%@page import="dto.UserDto"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="session.SessionProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
  <tr>
  	<th>id</th>
    <th>name</th>
    <th>email</th>
    <th>mobile</th>
    <th>pass</th>
     <th>action</th>
  </tr>
  <%
  FetchDao dao=new FetchDao();
  List list=dao.fetch();
  for(int i=0;i<list.size();i++){
	  UserDto dtoData=(UserDto)list.get(i);
  %>
  <tr>
  	<td> <%=dtoData.getId() %></td>
    <td> <%=dtoData.getName() %></td>
    <td> <%=dtoData.getEmail() %></td>
    <td> <%=dtoData.getMobile() %></td>
     <td> <%=dtoData.getPassword() %></td>
      <td> <a href="EditJsp.jsp?id=<%= dtoData.getId()%>">Edit</a> 
<a href="DeleteJsp.jsp?id=<%= dtoData.getId()%>">Delete</a>      
      </td>
  </tr>
  <%} %>
</table>

</body>
</html>
