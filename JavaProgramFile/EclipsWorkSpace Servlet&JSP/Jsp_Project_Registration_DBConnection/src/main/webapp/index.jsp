<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
<form action="connect.jsp" method="get"> 
<table>
<tr>
<td>First Name</td>
<td><input type="text" name="ufirst" placeholder="Enter First Name" required="required"></td>
</tr>

<tr>
<td>Last Name</td>
<td><input type="text" name="ulast" placeholder="Enter Last Name" required="required"></td>
</tr>

<tr>
<td>Gender</td>
<td><input type="radio" name="gender" value="Male" >Male
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="Other">Other
</td>
 
<tr>
<td>Email</td>
<td><input type="email" name="uemail" placeholder="Enter email" required="required"></td>
</tr>

 <tr>
<td>Password</td>
<td><input type="password" name="upass" placeholder="Enter password" required="required"></td>
</tr>
 <tr>
<td>Mobile</td>
<td><input type="number" name="umobile" placeholder="Enter Mobule Number" required="required"></td>
</tr>

<tr>
<td><input type="submit" value="Register"></td>
</tr>

</table>
</form>
</body>
</html>