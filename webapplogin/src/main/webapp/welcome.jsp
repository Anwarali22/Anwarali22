<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Vegetables and Fruit Shop</h1><br>
		<h3>Welcome!</h3><br><br> 
		<form action="shop1.do;jsessionid=<%= session.getId() %>" method="post">
		<input type="hidden" name="formid" value="ShoppingStarted">
		<h3><input type="submit" value="Click here"> to show Today's Vegetables and Fruit.</h3>
		</form>

</body>
</html>