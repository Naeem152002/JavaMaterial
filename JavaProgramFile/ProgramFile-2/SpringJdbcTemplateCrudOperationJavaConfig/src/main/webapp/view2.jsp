<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.dto.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Employees</title>
<style>
    .font-size-20px {
        font-size: 20px;
    }
</style>
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
        List<Employee> employees = (List<Employee>) request.getAttribute("employees");
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
