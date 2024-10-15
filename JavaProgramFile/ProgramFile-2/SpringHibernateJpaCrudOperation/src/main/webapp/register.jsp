
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="com.service.UserService" %>

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
    ApplicationContext app = new ClassPathXmlApplicationContext("appContext.xml");
   UserService userService = (UserService) app.getBean("userService");
   System.out.println(userService);

    boolean check = userService.insert(dto);
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
