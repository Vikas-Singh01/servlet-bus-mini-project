package servlet_bus_project.service;

import java.util.List;

import servlet_bus_project.dao.BusDao;
import servlet_bus_project.dto.Bus;

public class BusService 
{
	BusDao busDao=new BusDao();
	
	public void insertBus(Bus bus)
	{
		busDao.insertBus(bus);
	}
	
	public List<Bus> displayBuses()
	{
	return	busDao.displayBuses();
	}
	
	public int getById(int id)
	{
	return	busDao.getById(id);
	}
	
	public void deleteBus(int id)
	{
		busDao.deleteBus(id);
	}
	public Bus getBusById(int id)
	{
	   return busDao.getBusById(id);
	}
	public void updateBus(int id,Bus bus)
	{
		busDao.updateBus(id, bus);
	}
}
