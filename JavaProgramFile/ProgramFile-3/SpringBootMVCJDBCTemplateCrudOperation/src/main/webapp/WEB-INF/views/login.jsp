<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${msg }</h1>
<form action="doLogin" method="post">

<div>
<label for="name">Enter Name</label>
<input type="text" id="name" name="name" placeholder="Enter Name"/>
</div>
<div>
<label for="email">Enter Email</label>
<input type="email" id="email" name="email" placeholder="Enter Email"/>
</div>
<input type="submit" value="Login"/>
<a href="/">NewUser</a>

</form>
</body>
</html>