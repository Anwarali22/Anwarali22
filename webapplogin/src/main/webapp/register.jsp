<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
h1 {text-align: center;}
</style>
</head>
<body>
<h1>Register Please</h1><br><br><br>
		<form style="margin: auto; width: 220px;" action="register.do;jsessionid=<%= session.getId() %>" method="post">
		<input type="hidden" name="formid" value="register">
		    Full Name:<br><input type="text" name="fullname"><br><br>
		    User Name:<br><input type="text" name="uname"><br><br>
		     Password:<br><input type="password" name="upass"><br><br>
		         City:<br><input type="text" name="city"><br><br>
		    Mobile No:<br><input type="number" name="mobileNum"><br><br>
		
		<input type="submit" value="Register"><br>
		</form>
		<form style="margin: auto; width: 220px;" action="loginFromregister.do">
		<h6>Already have an account? <input type="submit" value="Login"> </h6>
		<input type="hidden" name="formid" value="loginFromregister">
		</form>
</body>
</html>