package servlet_bus_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_bus_project.service.UserService;

@SuppressWarnings("serial")
public class UserLoginController  extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("userId"));
		String password=req.getParameter("userPassword");
		UserService userService=new UserService();
		if(password.equalsIgnoreCase(userService.getPasswordById(id)))
		{
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body>");
			printWriter.write("<h2>User Login Successfull </h2>");
			printWriter.write("</body></html>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("searchbus.jsp");
			requestDispatcher.forward(req, resp);
		}
		else
		{
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body>");
			printWriter.write("<h2>Password is Incorrect</h2>");
			printWriter.write("</body></html>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp");
			requestDispatcher.include(req, resp);
		}
		
	}
}
