package servlet_bus_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_bus_project.dto.Bus;
import servlet_bus_project.service.BusService;

@SuppressWarnings("serial")
public class BusUpdateController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		BusService busService=new BusService();
		if(busService.getById(id)!=0)
		{
		PrintWriter printWriter=resp.getWriter();
		Bus bus=busService.getBusById(id);
		req.setAttribute("bus", bus);
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("busupdate.jsp");
		requestDispatcher.include(req, resp);
		}
		
	}
}
