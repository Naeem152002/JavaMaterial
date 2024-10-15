<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.dto.User" %>
<%@ page import="com.dao.UserDao" %>
<%@page import="org.springframework.context.ApplicationContext" %>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   
    	 ApplicationContext  app = new ClassPathXmlApplicationContext("appContext.xml");
        UserDao dao = (UserDao) app.getBean("dao"); // Correct bean name
int id=Integer.parseInt(request.getParameter("id"));
        boolean check = dao.deleteUser(id);
        if (check) {
            out.println("<h1>Successfully Deleted data<h1>");
%>
            <jsp:include page="view.jsp"></jsp:include>
<%
        } else {
            out.println("<h1>Data update failed. Error</h1>");
%>
            <jsp:include page="view.jsp"></jsp:include>
<%
        }
    
%>
</body>
</html>