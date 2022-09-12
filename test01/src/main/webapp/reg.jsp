<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Regjsp</title>
</head>
<body>
<%@page import ="java.sql.*" %>
<%@page import ="javax.sql.*" %>

<%
String user = request.getParameter ( " userid " ) ;
session.putValue("Userid",user);
String pwd = request.getParameter ( " pwd " ) ;
String fname = request.getParameter ( " fname " ) ;
String Iname = request.getParameter ( " Iname " ) ;
String email = request.getParameter ( " email " ) ;
Class.forName ( " com.mysql.jdbc.Driver " ) ;
java.sql.Connection con = DriverManager.getConnection ( " jdbc : mysql : // localhost : 3306 / aspire " ," root " , " root " ) ;
Statement st = con.createStatement ( ) ;
ResultSet rs;
int i=st.executeUpdate("insert into users values('"+user+"','"+pwd+"','"+fname+"','"+Iname+"','"+email+"')");
out.println("Registered");


%>



</body>
</html>