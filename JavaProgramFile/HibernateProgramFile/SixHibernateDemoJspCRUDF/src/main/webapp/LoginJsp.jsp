<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="dto.UserDto"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<jsp:useBean id="dao" class="dao.UserDao"></jsp:useBean>
<%
boolean isEmpty=dao.LoginDao(dto);
if(!isEmpty){
	out.println("Logged-in Successfully");
	%>
	<jsp:forward page="WelcomeJsp.jsp"></jsp:forward>
<%
}else{
	out.println("Login failed");
	%>
	<jsp:include page="LoginPage.html"></jsp:include>
	<%
}

%>
</body>
</html>