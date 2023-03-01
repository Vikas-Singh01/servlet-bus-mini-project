package servlet_bus_project.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import servlet_bus_project.dto.Admin;

public class AdminDao 
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
//	insert bus method
	public void insertAdmin(Admin admin)
	{
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
	}
	
//	get password by id
	public String getPassById(int id)
	{
		Admin admin=entityManager.find(Admin.class, id);
		
		if(admin!=null)
		{
			return admin.getAdminPassword();
		}
		else
		{
			return null;
		}
	}
}
