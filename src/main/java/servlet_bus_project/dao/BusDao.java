package servlet_bus_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_bus_project.dto.Bus;

public class BusDao 
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
//	insert bus method
	public void insertBus(Bus bus)
	{
		entityTransaction.begin();
		entityManager.persist(bus);
		entityTransaction.commit();
	}
	
	
//	display all buses
	@SuppressWarnings("unchecked")
	public List<Bus> displayBuses()
	{
		String select="select b from Bus b";
		Query query=entityManager.createQuery(select);
		return query.getResultList();
	}
	
//	getById
	public int getById(int id)
	{
		Bus bus=entityManager.find(Bus.class, id);
		if(bus!=null)
		{
			return bus.getBusId();
		}
		else
		{
			return 0;
		}
	}
	
//	delete Bus
	public void deleteBus(int id)
	{
		Bus bus=entityManager.find(Bus.class, id);
		entityTransaction.begin();
		entityManager.remove(bus);
		entityTransaction.commit();
	}
	
//	getBus by Id
	public Bus getBusById(int id)
	{
		Bus bus=entityManager.find(Bus.class, id);
		if(bus!=null)
		{
			return bus;
		}
		else
		{
			return null;
		}
	}
	
	public void updateBus(int id,Bus bus)
	{
		Bus bus2=entityManager.find(Bus.class, id);
		if(bus2!=null)
		{
			entityTransaction.begin();
			bus2.setBusName(bus.getBusName());
			bus2.setBusSource(bus.getBusSource());
			bus2.setBusDestination(bus.getBusDestination());
			bus2.setBusDate(bus.getBusDate());
			entityManager.merge(bus2);
			entityTransaction.commit();
		}
	}
}
