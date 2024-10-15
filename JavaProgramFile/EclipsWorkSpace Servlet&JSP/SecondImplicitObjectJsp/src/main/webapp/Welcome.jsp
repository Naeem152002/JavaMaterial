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
String name=request.getParameter("uname");  
out.println("welcome "+name); 

String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  

String driver1=application.getInitParameter("dname");  
out.print("driver name is="+driver1);  

session.setAttribute("user",name);
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
%> 
<a href="second.jsp">second jsp page</a>    
</body>
</html>