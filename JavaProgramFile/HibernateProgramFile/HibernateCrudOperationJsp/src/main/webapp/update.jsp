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
<jsp:useBean id="dto" class="com.dto.User" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
UserDao dao=new UserDaoImpl();
boolean check=dao.updateUser(dto);
if(check){
	out.println("<h2>Successfully Updated</h2>");
	%>
	<jsp:include page="view.jsp"></jsp:include>
	<% 
}else{
	out.println("Does not Update!!Error");
	%>
	<jsp:include page="edit.jsp"></jsp:include>
	<% 
}

%>
</body>
</html>