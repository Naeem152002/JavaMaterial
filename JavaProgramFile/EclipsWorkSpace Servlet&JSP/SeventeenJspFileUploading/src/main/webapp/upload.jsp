<%@ page import="com.oreilly.servlet.MultipartRequest" %>  
<%  
MultipartRequest m = new MultipartRequest(request, "C:\\Users\\naeem\\OneDrive\\Desktop\\JavaNotes\\JavaNotes");  
out.print("successfully uploaded");  
  
%>  