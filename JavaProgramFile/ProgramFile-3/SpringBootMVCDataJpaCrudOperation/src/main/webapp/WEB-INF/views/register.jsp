<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>${msg}</h1>
<body>
<form action="doRegister" method="post">
	<div>
	<label for="name">Enter Name</label>	
	<input type="text" id="name" name="name" placeholder="Enter Name"/>	
	</div>
	<div>
	<label for="email">Enter Email</label>	
	<input type="email" id="email" name="email" placeholder="Enter Email"/>	
	</div>
	<div>
	<label for="password">Enter Password</label>	
	<input type="password" id="password" name="password" placeholder="Enter Password"/>	
	</div>
	<div>
	<label for="mobile">Enter Mobile</label>	
	<input type="tel" id="mobile" name="mobile" placeholder="Enter Mobile"/>	
	</div>
	<a href="loginPage">Login</a>
	<input type="submit" value="Register"/>
	</form>
</body>
</html>