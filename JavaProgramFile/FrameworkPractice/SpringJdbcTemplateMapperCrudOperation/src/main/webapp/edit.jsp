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
<body>
<%
ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
UserDao dao=(UserDao)app.getBean("dao");
int id=Integer.parseInt(request.getParameter("id"));
User dto=dao.getById(id);
%>
<form action="update.jsp" method="post">

<input type="hidden" name="id" value="<%=dto.getId()%>"/>
Name:<input type="text" name="name" value="<%=dto.getName() %>" required="required"/><br>
Email:<input type="email" name="email" value="<%=dto.getEmail() %>" required="required"/><br>
Password:<input type="password" name="password" value="<%=dto.getPassword() %>" required="required"/><br>
Mobile:<input type="tel"  name="mobile" value="<%=dto.getMobile() %>" required="required"/><br>

<input type="submit" value="Update"/>



</form>

</body>
</html>