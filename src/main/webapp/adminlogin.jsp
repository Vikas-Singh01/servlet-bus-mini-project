<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2 style="color: green">Login as Admin</h2>
<body style="background-image: url('Images/admin login.png'); background-repeat: no-repeat; background-size: cover;">
<form action="adminLogin">
<label>Admin Id</label>
<input type="text" name="adminId" placeholder="Enter Admin Id"> <br> <br>
<label>Password</label>
<input type="text" name="adminPassword" placeholder="Enter Admin User password"> <br> <br>
<input type="submit" value="Login"> <br> <br>
<a href="insertadmin.jsp">New Admin Register</a>
</form>
</body>
</html>