<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
    <%@page import="org.springframework.context.ApplicationContext" %>
    <%@page import="com.dao.UserDao" %>
    <%@page import="com.dto.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="com.dto.User" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%

ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
UserDao dao=(UserDao)app.getBean("dao");
boolean check=dao.insert(dto);
if(check){
	out.println("<h2>Successfully Register</h2>");
	%>
	<jsp:include page="login.html"></jsp:include>
	<% 
}else{
	out.println("does not sucess");
	%>
	<jsp:include page="index.html"></jsp:include>
	<% 
}


%>
</body>
</html>