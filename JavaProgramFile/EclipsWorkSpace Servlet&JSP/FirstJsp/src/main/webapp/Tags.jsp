<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>JSP Tags use:</h1>
<body>
<%--Use of EXPESION TAG--%>
<%= "hello"+10

%>
<%--Use of DECLERATION TAG--%>

<%!
int a=10;
int b=20;
String name="APPLE";
public int add()
{
return a+b;	
}
public String revers()
{
	StringBuffer sf=new StringBuffer(name);
	return sf.reverse().toString();
	}
%>
<%-- Use of SCTIPTLET TAG--%>
<%
out.println(a);
out.println("<br>");
out.println(b);
out.println("<br>");
out.println("Sum of :" +add());
out.println("<br>");
out.println("Name Reverse Is: " +revers());
%>

</body>
</html>