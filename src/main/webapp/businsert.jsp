<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('Images/insert bus.png'); background-repeat: no-repeat; background-size: cover;">
<h2 style="color: blue;">Add new Bus...</h2>
<form action="busInsert">
<label> Bus Id</label>
<input type="text" name="busId" placeholder="Enter Bus Id"> <br> <br>
<label> Bus Name</label>
<input type="text" name="busName" placeholder="Enter Bus Name"> <br> <br>
<label> Source City</label>
<input type="text" name="sourceCity" placeholder="Enter Source City"> <br> <br>
<label> Destination City</label>
<input type="text" name="destiCity" placeholder="Enter Destination City"> <br> <br>
<label> Enter Date</label>
<input type="text" name="busDate" placeholder="Enter Bus Date"> <br> <br>
<input type="submit" value="Register"> <br> <br> <br>
<a href="busdisplay.jsp"> View All Buses</a>
</form>  
</body>
</html>