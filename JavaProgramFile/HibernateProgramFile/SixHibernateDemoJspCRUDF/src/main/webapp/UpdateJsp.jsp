<%@page import="dao.EditDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="dto.UserDto" ></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
int update=EditDao.edit(dto);
if(update>0){
	%>
	<jsp:forward page="ViewJsp.jsp"></jsp:forward>
<%
}else{
	out.println("Data updation failed");
}
%>
</body>
</html>