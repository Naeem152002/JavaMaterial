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
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
UserDao dao=new UserDaoImpl();
User dto=dao.getById(id);

%>
<form action="update.jsp" method="post">
<input type="hidden" name="id" value="<%=dto.getId()%>"/>
Name:<input type="text" name="name" value="<%=dto.getName()%>"/><br>
Email:<input type="email" name="email" value="<%=dto.getEmail()%>"/><br>
Password:<input type="password" name="password" value="<%=dto.getPassword()%>"/><br>
Mobile:<input type="tel" name="mobile" value="<%=dto.getMobile()%>"/><br>

<input type="submit"  value="Update"/>



</form>
</body>
</html>