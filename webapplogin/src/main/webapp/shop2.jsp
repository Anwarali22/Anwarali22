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
<h1>Fruits</h1><br><br><br>
<form action="invoice.do;jsessionid=<%= session.getId() %>" method="post">
<input type="hidden" name="formid" value="shopping">
<input type="hidden" name="shopid" value="shop2">
<input type="checkbox" name="f1" value="Apple">  Apple<br>
<input type="checkbox" name="f2" value="Mango">  Mango<br>
<input type="checkbox" name="f3" value="Orange">  Orange<br>
<input type="checkbox" name="f4" value="Grapes">  Grapes<br><br>
<input  type="submit" value="Finish">
</form>
</body>
</html>