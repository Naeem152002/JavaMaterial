<%@page import="org.springframework.context.annotation.AnnotationConfigApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="com.config.JavaConfig" %>
<%@ page import="com.dao.UserDao" %>
<%@ page import="com.dto.User" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
</head>
<body>
<jsp:useBean id="dto" class="com.dto.User" scope="request" />
<jsp:setProperty property="*" name="dto"/>

<%
   
    	 ApplicationContext  app = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserDao dao = (UserDao) app.getBean("dao"); // Correct bean name

        boolean check = dao.updateUser(dto);
        if (check) {
            out.println("<h1>Successfully updated data<h1>");
%>
            <jsp:include page="view.jsp"></jsp:include>
<%
        } else {
            out.println("Data update failed. Error.");
%>
            <jsp:include page="edit.jsp"></jsp:include>
<%
        }
    
%>
</body>
</html>
