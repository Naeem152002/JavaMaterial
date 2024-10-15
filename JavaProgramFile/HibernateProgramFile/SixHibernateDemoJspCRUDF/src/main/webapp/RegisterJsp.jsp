<%@page import="java.io.Serializable"%>
<%@page import="dto.UserDto"%>
<%@page import="dao.FetchDao"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="session.SessionProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dao" class="dao.UserDao"></jsp:useBean>
<jsp:useBean id="dto" class="dto.UserDto"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
Serializable save=dao.registerDao(dto);
if(save!=null){
	out.println("Successfully Registered");
	%>
	<jsp:include page="RegisterPage.html"></jsp:include>
	<%
}else{
	out.println("Registration failed");
}
%>

</body>
</html>
