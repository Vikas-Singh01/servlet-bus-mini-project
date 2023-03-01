package servlet_bus_project.service;

import servlet_bus_project.dao.AdminDao;
import servlet_bus_project.dto.Admin;

public class AdminService 
{
	AdminDao adminDao=new AdminDao();
	
	public void insertAdmin(Admin admin)
	{
		adminDao.insertAdmin(admin);
	}
	
	public String getPassById(int id)
	{
		return adminDao.getPassById(id);
	}
}
