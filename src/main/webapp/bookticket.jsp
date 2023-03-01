<%@page import="servlet_bus_project.dto.Bus"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>confirmation Page</title>
</head>
<h2 style="color: red">Confirm details and proceed for payment</h2>
<%Bus bus= (Bus)request.getAttribute("bus1"); %>
<body style="background-image: url('Images/bus ticket.jpg'); background-repeat: no-repeat; background-size: cover;">
<form action="paymentController">
<label> Bus Id</label>
<input type="text"  value="<%= bus.getBusId() %>" readonly="readonly"> <br> <br>
<label> Bus Name</label>
<input type="text"  value="<%= bus.getBusName() %>" readonly="readonly"> <br> <br>
<label> Source City</label>
<input type="text"  value="<%= bus.getBusSource() %>" readonly="readonly"> <br> <br>
<label> Destination City</label>
<input type="text"  value="<%= bus.getBusDestination() %>" readonly="readonly"> <br> <br>
<label> Enter Date</label>
<input type="text" name="busDate" value="<%= bus.getBusDate() %>" readonly="readonly"> <br> <br>
<input type="submit" value="Make Payment"> <br> <br> <br>
</form> 
</body>
</html>