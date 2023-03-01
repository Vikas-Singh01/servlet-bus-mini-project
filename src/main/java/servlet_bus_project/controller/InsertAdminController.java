package servlet_bus_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet_bus_project.dto.Admin;
import servlet_bus_project.service.AdminService;
@SuppressWarnings("serial")
public class InsertAdminController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String authpass=req.getParameter("authPass");
		int id=Integer.parseInt(req.getParameter("adminId"));
		String password=req.getParameter("adminPassword");
		Admin admin=new Admin();
		admin.setAdminId(id);
		admin.setAdminPassword(password);
		AdminService adminService=new AdminService();
		if(authpass.equals("vikas123"))
		{
			PrintWriter printWriter=resp.getWriter();
			adminService.insertAdmin(admin);
			printWriter.write("<html><body>");
			printWriter.write("<h2 'style:color=green'> New Admin created</h2>");
			printWriter.write("</body></html>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("adminlogin.jsp");
			requestDispatcher.include(req, resp);
		}
		else
		{
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body>");
			printWriter.write("<h2 'style:color=red'> Authenticated Password is wrong </h2>");
			printWriter.write("</body></html>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("insertadmin.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}
