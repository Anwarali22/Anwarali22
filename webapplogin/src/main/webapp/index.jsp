<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
<h3>Hello!</h3><br><br> 
		<form action="reception.do;jsessionid=<%= session.getId() %>" method="post">
		<input type="hidden" name="formid" value="index">
		<h3><label>Select Language</label></h3>
		<select name="lang">
			<option value="ta">Tamil</option>
			<option value="hi">Hindi</option>
			<option value="en">English</option>
		</select>
		<h3><input type="submit" value="Click here"> to browse our shop.</h3>
		</form>
</body>
</html>