<%@page import="dao.DeleteDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int delete=DeleteDao.delete(request.getParameter("id"));
if(delete>0){
	%>
	<jsp:forward page="ViewJsp.jsp"></jsp:forward>
<%
}else{
	out.println("Data deletion failed");
}
%>
</body>
</html>
