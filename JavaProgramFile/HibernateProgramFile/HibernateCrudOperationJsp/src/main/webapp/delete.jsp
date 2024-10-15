<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
int id=Integer.parseInt(request.getParameter("id"));
UserDao dao=new UserDaoImpl();
boolean check=dao.delteUser(id);
if(check){
	out.println("<h2>Successfully Deleted</h2>");
	%>
	<jsp:include page="view.jsp"></jsp:include>
	<% 
}else{
	out.println("Does not Deleted!!Error");
	%>
	<jsp:include page="view.jsp"></jsp:include>
	<% 
}

%>
</body>
</html>