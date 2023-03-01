<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BUS-Service</title>
</head>
<body style="background-image: url('Images/2ffcb91460d1d4b0d2ef8b3424b30779.jpg'); background-repeat: no-repeat; background-size: cover; ">
<h1 style="color: aqua">Welcome to Bus Booking Service</h1>
<form action="userLogin">
<label> User Id</label>
<input type="text" name="userId" placeholder="Enter user Id"> <br> <br>
<label>User password</label>
<input type="text" name="userPassword" placeholder="Enter Your Password"> <br> <br>
<input type="submit" value="Login"> <br> <br> <br>
<a href="insertuser.jsp" style="color: red">New User Register Here</a>	<br> <br> <br>
<a href="adminlogin.jsp" style="color: red">Login as Admin</a>
</form>
</body>
</html>