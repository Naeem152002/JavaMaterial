
<%@page import="com.entities.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> ${title} </title>
</head>
<body>
<div>
<h2>Welcome Users</h2>
</div>

<div>
<table border="1">
<thead style="border-bottom-color: red;background: gray;">
<td>Name</td>
<td>Email</td>
<td>Password</td>
<td>Mobile</td>
<td>Action</td>
</thead>

<tbody>
 <c:forEach items="${userList}" var="user"> 
<tr>
<td>${user.name}</td>
<td>${user.email}</td>
<td>${user.password}</td>
<td>${user.mobile}</td>
<td>
<a href="updateJsp?id=${user.id}">Update</a>
<a href="deleteJsp?id=${user.id}">Delete</a>
</td>
</tr>
</c:forEach> 

</tbody>
</table>

</div>

</body>
</html>