<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
</head>
<body>
	<h1>${msg}</h1>
<h1>Login Page</h1>
	<form action="doLogin" method="post" required>
		Email <input type="text" name="email">
		<br>
		Password <input type="password" name="password" required>
		<br>
		<input type="submit" value="Login">
		<a href="register">NewUser</a>
	</form>	
</body>
</html>