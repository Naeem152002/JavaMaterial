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
<jsp:setProperty property="*" name="dto"/>
<%

UserDao dao=new UserDaoImpl();
    boolean check = dao.insert(dto);
    System.out.println(dto);
    if(check){
    	out.println("<h2>Register Successfully</h2>");
    	%>
    	<jsp:include page="login.html"></jsp:include>
    	<%
    }
    else{
    	out.println("Does not Register!!Error");
    	%>
    	<jsp:include page="index.html"></jsp:include>
    	<% 
    }
   
%>
 
</body>
</html>