<%@page import="org.springframework.context.annotation.AnnotationConfigApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page
	import="com.config.JavaConfig"%>
<%@ page import="com.dao.UserDao"%>
<%@ page import="com.dto.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
</head>
<body>

	<%
   
ApplicationContext app = new AnnotationConfigApplicationContext(JavaConfig.class);
UserDao dao = (UserDao) app.getBean("dao");
int id=Integer.parseInt(request.getParameter("id"));
boolean check=dao.deleteUser(id);
        if (check) {
            out.println("Successfully Delete data");
%>
	<jsp:include page="view.jsp"></jsp:include>
	<% 
        } else {
            out.println("Data update failed. Error.");
%>
	<jsp:include page="view.jsp"></jsp:include>
	<%
        }
    
%>
</body>
</html>
