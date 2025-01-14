<%@page import="org.springframework.context.annotation.AnnotationConfigApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.dto.User" %>
<%@ page import="com.dao.*" %>
<%@page import="org.springframework.context.ApplicationContext" %>
<%@page import="com.config.JavaConfig" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
</head>
<body>
    <%-- Retrieve employee information from request attribute --%>
    <% 
    ApplicationContext app = new AnnotationConfigApplicationContext(JavaConfig.class);
    UserDao dao = (UserDao) app.getBean("dao");
    int id=Integer.parseInt(request.getParameter("id"));
    User dto=dao.getById(id);
    
    %>

    <form action="update.jsp" method="post">
        <input type="hidden" name="id" value="<%= dto.getId() %>">
        Name: <input type="text" name="name" value="<%= dto.getName() %>" required><br>
        Email: <input type="email" name="email" value="<%= dto.getEmail() %>" required><br>
        Mobile: <input type="tel" name="mobile" value="<%= dto.getMobile() %>" required><br>
        Password: <input type="password" name="password" value="<%= dto.getPassword() %>" required><br>
        <input type="submit" value="Update">
    </form>
</body>
</html>
