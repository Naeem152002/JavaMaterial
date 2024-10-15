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
<jsp:setProperty property="*" name="dto"/>

<%

ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
UserDao dao=(UserDao)app.getBean("dao");
boolean check=dao.updateUser(dto);
if(check){
	out.println("<h2>Successfully Updated</h2>");
	%>
	<jsp:include page="view.jsp"></jsp:include>
	<% 
}else{
	out.println("does not Update");
	%>
	<jsp:include page="edit.jsp"></jsp:include>
	<% 
}


%>
</body>
</html>