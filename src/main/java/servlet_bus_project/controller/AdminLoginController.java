package servlet_bus_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet_bus_project.service.AdminService;
@SuppressWarnings("serial")
public class AdminLoginController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("adminId"));
		String password=req.getParameter("adminPassword");
		AdminService adminService=new AdminService();
		if(adminService.getPassById(id).equalsIgnoreCase(password))
		{
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body>");
			printWriter.write("<h2> Login Successfull </h2>");
			printWriter.write("</body></html>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("busdisplay.jsp");
			requestDispatcher.include(req, resp);
		}
		else
		{
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body>");
			printWriter.write("<h2> please check username and password </h2>");
			printWriter.write("</body></html>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("adminlogin.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}
