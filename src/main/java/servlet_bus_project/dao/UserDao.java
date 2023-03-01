package servlet_bus_project.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import servlet_bus_project.dto.User;

public class UserDao 
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
//	insert user method
	public void insertUser(User user)
	{
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}
	
	public String getPasswordById(int id)
	{
		User user=entityManager.find(User.class, id);
		if(user!=null)
		{
			return user.getUserPass();
		}
		else {
			return null;
		
		}
	}
}
