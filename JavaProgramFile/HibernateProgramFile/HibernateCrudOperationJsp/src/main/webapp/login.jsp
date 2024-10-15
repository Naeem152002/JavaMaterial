<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.dto.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="com.dto.User" scope="request"></jsp:useBean>
<jsp:setProperty property="name" name="dto"/>
<jsp:setProperty property="email" name="dto"/>
<%
UserDao dao=new UserDaoImpl();
User check=dao.getByEmailAndName(dto);
session.setAttribute("name", dto.getName());
session.setAttribute("email", dto.getEmail());
if(check!=null){
	%>
	<jsp:forward page="welcome.jsp"></jsp:forward>
	<% 
}else{
	out.println("Does not login!!Error");
	%>
	<jsp:include page="login.html"></jsp:include>
	<% 
}

%>
</body>
</html>