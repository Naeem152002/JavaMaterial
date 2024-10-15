<%@page import="com.dao.UserDao"%>  
<jsp:useBean id="u" class="com.dto.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=UserDao.update(u) ;
response.sendRedirect("viewusers.jsp");  
%>  