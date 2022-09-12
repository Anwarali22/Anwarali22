<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Account</title>
</head>
<body>
	<div class="container">
		<div class="regbox box">
			<img class="avatar" src="img/collaboration.png">
			<h1>Register Account</h1>
			<form action="RegisterServlet" method="post">
				<p>Username</p>
				<input type="text" placeholder="Username" name="name" required>
				<p>Useremail</p>
				<input type="text" placeholder="Useremail" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required> <input type="submit" value="Register"> <a
					href="Login.jsp">Already have Account?</a>
			</form>
		</div>
	</div>
</body>
</html>