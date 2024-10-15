<%@page import="org.springframework.context.annotation.AnnotationConfigApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.springframework.context.ApplicationContext" %>
<%@page import="com.config.JavaConfig" %>
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
    ApplicationContext app = new AnnotationConfigApplicationContext(JavaConfig.class);
    EmployeeDao dao =app.getBean("dao",EmployeeDao.class);

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
