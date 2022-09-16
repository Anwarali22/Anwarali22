<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Vegetables</h1><br><br><br>
<form action="shop2.do;jsessionid=<%= session.getId() %>" method="post">
<input type="hidden" name="formid" value="shopping">
<input type="hidden" name="shopid" value="shop1">
<input type="checkbox" name="v1" value="Brinjal">  Brinjal<br>
<input type="checkbox" name="v2" value="Tomato">  Tomato<br>
<input type="checkbox" name="v3" value="Potato">  Potato<br>
<input type="checkbox" name="v4" value="Onion">  Onion<br><br>
<input  type="submit" value="Next">
</form>
</body>
</html>