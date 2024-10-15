<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="dto.Dto"></jsp:useBean>
<jsp:useBean id="dao" class="dao.UserDao"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
int i=dao.registerDao(dto);
if(i>0)
response.sendRedirect("LoginPage.html");

%>
</body>
</html>