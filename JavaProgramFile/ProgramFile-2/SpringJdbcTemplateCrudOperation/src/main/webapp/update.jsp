<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="com.dao.EmployeeDao" %>
<%@ page import="com.dto.Employee" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
</head>
<body>
<jsp:useBean id="dto" class="com.dto.Employee" scope="request" />
<jsp:setProperty property="*" name="dto"/>

<%
   
    	 ApplicationContext  app = new ClassPathXmlApplicationContext("appContext.xml");
        EmployeeDao dao = (EmployeeDao) app.getBean("dao"); // Correct bean name

        boolean check = dao.updateEmployee(dto);
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
