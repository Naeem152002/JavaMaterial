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


<%
    ApplicationContext app = new ClassPathXmlApplicationContext("appContext.xml");
    UserDao dao = (UserDao) app.getBean("dao");
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    User dto=new User(name,email);
    User check= dao.getByEmailandName(dto);
    session.setAttribute("name", name);
	session.setAttribute("email", email);
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
