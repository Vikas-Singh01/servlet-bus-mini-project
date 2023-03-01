package servlet_bus_project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_bus_project.dto.Bus;
import servlet_bus_project.service.BusService;

@SuppressWarnings("serial")
public class BusInsertController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("busId"));
		String name=req.getParameter("busName");
		String source=req.getParameter("sourceCity");
		String destination=req.getParameter("destiCity");
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date=simpleDateFormat.parse(req.getParameter("busDate"));
		Bus bus=new Bus();
		bus.setBusId(id);
		bus.setBusName(name);
		bus.setBusSource(source);
		bus.setBusDestination(destination);
		bus.setBusDate(date);
		BusService busService=new BusService();
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		busService.insertBus(bus);
		printWriter.write("<h2 style='color:green'>bus inserted successfully</h2>");
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("businsert.jsp");
		requestDispatcher.forward(req, resp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
