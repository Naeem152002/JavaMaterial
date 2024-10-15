<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.springframework.context.ApplicationContext" %>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@page import="com.dao.UserDao" %>
<%@page import="com.dto.User" %>

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
    UserDao dao = (UserDao) app.getBean("dao");
    User check= dao.getByEmailAndName(dto);
    session.setAttribute("name", dto.getName());
	session.setAttribute("email", dto.getEmail());
    if (check!=null) {
%>
        <jsp:forward page="welcome.jsp"></jsp:forward>
<%
    } else {
        out.println("Does not login!!Error");
%>
        <jsp:include page="login.html"></jsp:include>
<%
    }
%>

</body>
</html>
