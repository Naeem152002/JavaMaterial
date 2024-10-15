<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
    <%@page import="org.springframework.context.ApplicationContext" %>
    <%@page import="com.dao.UserDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
UserDao dao=(UserDao)app.getBean("dao");
int id=Integer.parseInt(request.getParameter("id"));
boolean check=dao.deleteUser(id);
if(check){
	out.println("<h2>Successfully Deleted</h2>");
	%>
	<jsp:include page="view.jsp"></jsp:include>
	<% 
}else{
	out.println("does not Delete");
	%>
	<jsp:include page="view.jsp"></jsp:include>
	<% 
}


%>
</body>
</html>