<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home-Login</title>
<style>
h1 {text-align: center;}
</style>
</head>
<body>
<%
	ResourceBundle rb=(ResourceBundle)session.getAttribute("rb");
%>
<h1>Hello! Login please</h1><br><br><br>
<form style="margin: auto; width: 220px;" action="login.do;jsessionid=<%= session.getId() %>" method="post">
		<input type="hidden" name="formid" value="login">
		<%=rb.getString("username")%>:<br><input type="text" name="uname"><br><br><br>
		<%=rb.getString("password")%>:<br><input type="password" name="upass"><br><br>
		&emsp;&emsp;&emsp;&ensp;&ensp;<input type="submit" value="<%=rb.getString("login")%>">
		</form><br><form style="margin: auto; width: 220px;" action="registerFromlogin.do">
		Don't have an account?<input type="submit" value="<%=rb.getString("register")%>">
		<input type="hidden" name="formid" value="registerFromlogin">
		</form>
</body>
</html>