<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
</head>
<body>
<h1>${msg}</h1>
	<h1>RegisterPage</h1>
	<form action="doRegister" method="post">
		
		Name <input type="text" name="name" required>
		<br>
		Email <input type="email" name="email" required>
		<br>
		Mobile <input type="tel" name="mobile" required>
		<br>
		Password <input type="password" name="password" required>
		<br>
		<input type="submit" value="Register">
		
	</form>	
</body>
</html>