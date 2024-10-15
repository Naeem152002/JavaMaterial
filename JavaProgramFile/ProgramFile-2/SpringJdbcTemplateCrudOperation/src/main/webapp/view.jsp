<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.springframework.context.ApplicationContext" %>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@page import="com.dao.EmployeeDao" %>
<%@page import="com.dto.Employee" %>
<%@page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" class="font-size-20px">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>password</th>
        <th>mobile</th>
        <th>action</th>
    </tr>
    <%
    ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
    EmployeeDao dao = (EmployeeDao) appContext.getBean("dao");

    List<Employee> employees = dao.getAllEmployees();
        if (employees != null) {
            for (Employee dtoData : employees) {
    %>
    <tr>
        <td><%= dtoData.getId() %></td>
        <td><%= dtoData.getName() %></td>
        <td><%= dtoData.getEmail() %></td>
        <td><%= dtoData.getPassword() %></td>
        <td><%= dtoData.getMobile() %></td>
        <td>
            <a href="edit.jsp?id=<%= dtoData.getId() %>">Edit</a>
            <a href="delete.jsp?id=<%= dtoData.getId() %>">Delete</a>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>