<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loginjsp</title>
</head>
<body>
<%@page import ="java.sql.*" %>
<%@page import ="javax.sql.*" %>
<%



String userid = request.getParameter ( " usr " ) ;
session.putValue ( " userid " , userid ) ;
String pwd = request.getParameter ( " pwd " ) ;
Class.forName ( " com.mysql.jdbc.Driver " ) ;
java.sql.Connection con = DriverManager.getConnection ( " jdbc : mysql : // localhost : 3306 / test " , " root " , " root " ) ;
Statement st = con.createStatement ( ) ;
ResultSet rs = st.executeQuery ( " select * from users where userid = '"  + userid + " ' " ) ;
if ( rs.next ( ) )
{

if ( rs.getString ( 2 ) .equals ( pwd ) )

{
	out.println("Welcome"+userid);
	
}else
{
	out.println("Invalid password to try again");
	
}
}else

%>
</body>
</html>