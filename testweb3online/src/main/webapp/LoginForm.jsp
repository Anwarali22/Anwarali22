<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login </title>

</head>
<body>
 <div align="center">
  <h1>User Login</h1></div>
  <form action =LoginServlet method="post">
  <%-- <form action="<%= request.getContextPath() %>/register" method="post"> --%>
  <!--  <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstName" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastName" /></td>
    </tr>
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
    <tr>
     <td>Address</td>
     <td><input type="text" name="address" /></td>
    </tr>
    <tr>
     <td>Contact No</td>
     <td><input type="text" name="contact" /></td>
    </tr>
   </table> -->
   
   <center>
   <table>
   <tr><td>Enter Name:</td><td><input type="text" name="txtname" /></td></tr>
   <tr><td>Enter Password:</td><td><input type="text" name="txtpwd" /></td></tr>
      <tr><td><input type="Submit" Value="Login" ></td><td><input type="reset"></td></tr>
   

   </table></center>
   
  </form>

</body>
</html>