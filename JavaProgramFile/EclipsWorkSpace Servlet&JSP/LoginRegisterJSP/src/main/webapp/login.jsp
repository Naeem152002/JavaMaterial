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

<%String name = dao.loginDao(dto);
if (name!=null) {
	session.setAttribute("name", name);
	%>
	<jsp:forward page="welcome.jsp"></jsp:forward>
	<%
}
else {
	out.println("Invalid Details");
	%>
	<jsp:include page="LoginPage.html"></jsp:include>
	<%
} %>
</body>
</html>