package servlet_bus_project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_bus_project.dto.Bus;
import servlet_bus_project.service.BusService;

@SuppressWarnings("serial")
public class BookTicketController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		BusService busService=new BusService();
		Bus bus=busService.getBusById(id);
		if(bus!=null)
		{
			req.setAttribute("bus1", bus);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("bookticket.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
