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
<jsp:useBean id="dto" class="com.dto.User"></jsp:useBean>
<jsp:setProperty property="name" name="dto"/>
<jsp:setProperty property="email" name="dto"/>

<%

ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
UserDao dao=(UserDao)app.getBean("dao");
User check=dao.getByEmailAndName(dto);
if(check!=null){
	session.setAttribute("name", dto.getName());
	session.setAttribute("email", dto.getEmail());
	%>
	<jsp:forward page="welcome.jsp"></jsp:forward>
	<% 
}else{
	out.println("does not sucess");
	%>
	<jsp:include page="login.html"></jsp:include>
	<% 
}


%>
</body>
</html>