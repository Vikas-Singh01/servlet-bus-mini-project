package servlet_bus_project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_bus_project.dto.Bus;
import servlet_bus_project.service.BusService;

@SuppressWarnings("serial")
public class SearchBusController extends HttpServlet 
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String source=req.getParameter("sourceCity");
	String destination=req.getParameter("destiCity");
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
	try 
	{
		Date date=simpleDateFormat.parse(req.getParameter("busDate"));
		BusService busService=new BusService();
		List<Bus> buses=busService.displayBuses();
		List<Bus> buses2=new ArrayList<Bus>();
		
		for (Bus bus : buses) 
		{
			if ((source.equalsIgnoreCase(bus.getBusSource())) && (destination.equalsIgnoreCase(bus.getBusDestination())) && (date.equals(bus.getBusDate()))) {
				buses2.add(bus);
				req.setAttribute("buses",buses2);	
			}
		}
		if(!buses2.isEmpty())
		{
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("bookbuses.jsp");
		requestDispatcher.forward(req, resp);
		}
		else
		{
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body>");
			printWriter.write("<h2 style='color:red'> No Bus available for this choice </h2>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("searchbus.jsp");
			requestDispatcher.include(req, resp);
		}
	}
	catch (Exception e) 
	{
		// TODO: handle exception
	}
}
}
