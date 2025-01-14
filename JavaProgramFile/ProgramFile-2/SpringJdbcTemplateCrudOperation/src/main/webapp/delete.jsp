<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page
	import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@ page import="com.dao.EmployeeDao"%>
<%@ page import="com.dto.Employee"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
</head>
<body>

	<%
   
ApplicationContext app = new ClassPathXmlApplicationContext("appContext.xml");
EmployeeDao dao = (EmployeeDao) app.getBean("dao");
int id=Integer.parseInt(request.getParameter("id"));
boolean check=dao.deleteEmployee(id);
        if (check) {
            out.println("Successfully Delete data");
%>
	<jsp:include page="view.jsp"></jsp:include>
	<% 
        } else {
            out.println("Data update failed. Error.");
%>
	<jsp:include page="view.jsp"></jsp:include>
	<%
        }
    
%>
</body>
</html>
