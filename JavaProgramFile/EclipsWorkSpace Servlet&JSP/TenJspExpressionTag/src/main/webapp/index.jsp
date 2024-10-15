<form action="process.jsp">  
Enter Name:<input type="text" name="name" /><br/><br/>  
<input type="submit" value="go"/>  
</form>  
<h3>welcome to index page</h3>  
<%  
session.setAttribute("user","sonoo");  
%>  
  
<a href="process.jsp">visit</a>  