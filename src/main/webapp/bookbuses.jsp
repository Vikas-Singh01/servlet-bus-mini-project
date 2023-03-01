<%@page import="java.util.ArrayList"%>
<%@page import="servlet_bus_project.dto.Bus"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('Images/bus-ticket-booking-logo.jpg'); background-repeat: no-repeat; background-size: cover;">

<h1 style="color: blue">Select Bus to book ticket</h1>
 <% 
 		List<Bus> buses=(ArrayList<Bus>)(request.getAttribute("buses")); 
 
 %> 

 <table border="4">
    <tr>
    <td>Bus Id</td>
    <td>Bus Name</td>
    <td>Bus Source</td>
    <td>Bus Destination</td>
    <td>Bus Date</td>
    <td>Book Ticket</td>
    </tr>
   <%for(Bus bus:buses){%>
     <tr>
    <td><%= bus.getBusId() %></td>
    <td><%= bus.getBusName() %></td>
    <td><%= bus.getBusSource() %></td>
    <td><%= bus.getBusDestination() %></td>
    <td><%= bus.getBusDate() %></td>
    <td><a href="bookTicket?id=<%= bus.getBusId()%>">Book Ticket</a></td>
    </tr> 
  <%}%>
  </table>
</body>
</html>