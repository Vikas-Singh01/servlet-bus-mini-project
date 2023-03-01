package servlet_bus_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_bus_project.dto.User;
import servlet_bus_project.service.UserService;

@SuppressWarnings("serial")
public class UserInsertController extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("Id"));
	String password=req.getParameter("Password");
	User user=new User();
	user.setUserID(id);
	user.setUserPass(password);
	UserService userService=new UserService();
	PrintWriter printWriter=resp.getWriter();
	printWriter.write("<html><body>");
	userService.insertUser(user);
	printWriter.write("<h2>User inserted successfully </h2>");
	printWriter.write("</body></html>");
	RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp");
	requestDispatcher.include(req, resp);
	}
}
