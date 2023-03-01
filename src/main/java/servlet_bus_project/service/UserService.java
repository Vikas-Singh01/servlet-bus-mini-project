package servlet_bus_project.service;

import servlet_bus_project.dao.UserDao;
import servlet_bus_project.dto.User;

public class UserService 
{
	UserDao userDao=new UserDao();
	
	public void insertUser(User user)
	{
		userDao.insertUser(user);
	}
	
	public String getPasswordById(int id)
	{
		return userDao.getPasswordById(id);
	}
}
