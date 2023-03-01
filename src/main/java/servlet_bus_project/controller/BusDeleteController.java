package servlet_bus_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_bus_project.service.BusService;

@SuppressWarnings("serial")
public class BusDeleteController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		BusService busService=new BusService();
		
		if(busService.getById(id)!=0)
		{
		PrintWriter printWriter=resp.getWriter();
		busService.deleteBus(id);
		printWriter.write("<html><body>");
		printWriter.write("<h2 style='color:red'> Bus Deleted Successfully </h2>");
		printWriter.write("</body></html>");
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("busdisplay.jsp");
		requestDispatcher.include(req, resp);
		}
		
		else
		{
			PrintWriter printWriter=resp.getWriter();	
			printWriter.write("<html><body>");
			printWriter.write("<h2 style='color:red'> Please check id </h2>");
			printWriter.write("</body></html>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("busdisplay.jsp");
			requestDispatcher.include(req, resp);
		}	
	}
}
