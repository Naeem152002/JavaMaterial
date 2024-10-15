<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.springframework.context.ApplicationContext" %>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@page import="com.dao.EmployeeDao" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<jsp:useBean id="dto" class="com.dto.Employee" scope="request" />
<jsp:setProperty property="*" name="dto"/>

<%
    ApplicationContext app = new ClassPathXmlApplicationContext("appContext.xml");
    EmployeeDao dao = (EmployeeDao) app.getBean("dao");

    boolean check = dao.insert(dto);
    if (check) {
        out.println("Successfully Data inserted");
%>
        <jsp:include page="login.html"></jsp:include>
<%
    } else {
        out.println("Error");
%>
        <jsp:include page="index.html"></jsp:include>
<%
    }
%>

</body>
</html>
