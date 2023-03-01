<%@page import="servlet_bus_project.dto.Bus"%>
<%@page import="java.util.List"%>
<%@page import="servlet_bus_project.dao.BusDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('Images/2ffcb91460d1d4b0d2ef8b3424b30779.jpg'); background-repeat: no-repeat; background-size: cover;">
<h2 style="color: green;"> Total Buses are... </h2>
<% BusDao busDao=new BusDao();
	List<Bus> buses=busDao.displayBuses();
%>

<table border="2">
<tr>
<td>BusId</td>
<td>BusName</td>
<td>BusSource</td>
<td>BusDestintion</td>
<td>BusDate</td>
<td>Update</td>
<td>Delete</td>
</tr>

<%for(Bus bus : buses) { %>
<tr>
<td><%=bus.getBusId()%></td>
<td><%=bus.getBusName()%></td>
<td><%=bus.getBusSource()%></td>
<td><%=bus.getBusDestination()%></td>
<td><%=bus.getBusDate()%></td>
<td><a href="updateBus?id=<%= bus.getBusId()%>">Update</a></td>
<td><a href="deleteBus?id=<%= bus.getBusId()%>">Delete</a></td>
</tr>
<%} %>
</table> <br> <br> <br>
<a href="businsert.jsp"> Insert new Bus</a>
</body>
</html>