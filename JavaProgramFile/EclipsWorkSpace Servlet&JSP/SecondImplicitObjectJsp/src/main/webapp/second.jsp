<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%   
  
String name=(String)session.getAttribute("user");  
out.print("Hello "+name);  
  
String name1=(String)pageContext.getAttribute("user",PageContext.SESSION_SCOPE);  
out.print("Hello "+name1);  
  

%>  
</body>
</html>