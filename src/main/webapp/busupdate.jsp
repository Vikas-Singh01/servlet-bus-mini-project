<%@page import="servlet_bus_project.dto.Bus"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Bus bus=(Bus)request.getAttribute("bus"); 
%>
<form action="busUpdateComplete">
<label> Bus Id</label>
<input type="text" name="busId" value="<%= bus.getBusId() %>" hidden="true"> <br> <br>
<label> Bus Name</label>
<input type="text" name="busName" value="<%= bus.getBusName() %>"> <br> <br>
<label> Source City</label>
<input type="text" name="sourceCity" value="<%= bus.getBusSource() %>"> <br> <br>
<label> Destination City</label>
<input type="text" name="destiCity" value="<%= bus.getBusDestination() %>" > <br> <br>
<label> Enter Date</label>
<input type="text" name="busDate" value="<%= bus.getBusDate()  %>"> <br> <br>
<input type="submit" value="Update"> <br> <br> <br>
</form>  
</body>
</html>