package servlet_bus_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class PaymentController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		printWriter.write("<h2 style='color:green' Booking Successfull Happy Journey , Book return ticket ticket></h2>");
		printWriter.write("</body></html>");
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("searchbus.jsp");
		requestDispatcher.include(req, resp);
	}
}
