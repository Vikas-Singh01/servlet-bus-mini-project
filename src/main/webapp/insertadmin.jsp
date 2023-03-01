<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('Images/bus-admin.webp'); background-repeat: no-repeat; background-size: cover;">
<h2 style="color: red">Enter authenticated password and add new Admin</h2>
<form action="insertAdmin">
<label>Authenticated Password</label>
<input type="text" name="authPass" placeholder="Enter Authenticated Password"> <br> <br>
<label>Admin Id</label>
<input type="text" name="adminId" placeholder="Enter Admin Id"> <br> <br>
<label>Enter Admin Password</label>
<input type="text" name="adminPassword" placeholder="Enter Admin User password"> <br> <br>
<input type="submit" value="Login">
</form>
</body>
</html>