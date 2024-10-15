<%@page import="org.springframework.context.annotation.AnnotationConfigApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.springframework.context.ApplicationContext" %>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@page import="com.dao.EmployeeDao" %>
<%@page import="com.dto.Employee" %>
<%@page import="com.config.JavaConfig" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>


<%
    ApplicationContext app = new AnnotationConfigApplicationContext(JavaConfig.class);
    EmployeeDao dao = (EmployeeDao) app.getBean("dao");
    String name=request.getParameter("name");
    String email=request.getParameter("email");
Employee dto=new Employee(name,email);
    
    Employee check= dao.getByEmailAndName(dto.getName(),dto.getEmail());
    if (check!=null) {
    	session.setAttribute("name", name);
    	session.setAttribute("email", email);
%>
        <jsp:include page="welcome.jsp"></jsp:include>
<%
    } else {
        out.println("Does not login!!Error");
%>
        <jsp:include page="login.html"></jsp:include>
<%
    }
%>

</body>
</html>
