<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.util.Random,java.util.ArrayList,java.io.*" 
     session="false" 
    autoFlush="true" buffer="8kb" contentType="text/html; charset=ISO-8859-1"
     errorPage="Error.jsp" 
     isErrorPage="true"
     language="java"
    info="This jsp devloped by @akash kumar"
    %>
    
     <%@include file="include.jsp" %>
   <%@include file="Footer.jsp" %>
     
     
     
     <%
     Random rn=new  Random();
     
     int n=rn.nextInt(100);
     out.println("Rendom Number genrated Every Refresh :"+n);
     
   
     
     %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">


</body>
</html>