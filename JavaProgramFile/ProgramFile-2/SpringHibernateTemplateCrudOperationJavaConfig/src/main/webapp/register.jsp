<%@page import="org.springframework.context.annotation.AnnotationConfigApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.springframework.context.ApplicationContext" %>
<%@page import="com.config.JavaConfig" %>
<%@page import="com.dao.UserDao" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<jsp:useBean id="dto" class="com.dto.User" scope="request" />
<jsp:setProperty property="*" name="dto"/>

<%
    ApplicationContext app = new AnnotationConfigApplicationContext(JavaConfig.class);
   UserDao dao = (UserDao) app.getBean("dao");

    boolean check = dao.insert(dto);
    if (check) {
        out.println("<h2>Successfully Data inserted</h2>");
%>
        <jsp:include page="login.html"></jsp:include>
<%
    } else {
        out.println("<h2>Does not data inserted !!Error<h2>");
%>
        <jsp:include page="index.html"></jsp:include>
<%
    }
%>

</body>
</html>
