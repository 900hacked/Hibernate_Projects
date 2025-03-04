package learninghibernate.Industry_management_System;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Read {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		List<Industry> entities = session.createQuery("from Industry",Industry.class).list();
		 
		 for (Industry entity : entities) {
		 System.out.println(entity.getIndustries().getName() + " " + entity.getIndustries().getProduct() + " " + entity.getLocation().getNameOfTheVillage() + " " + entity.getLocation().getTown() + " " + entity.getLocation().getPostalCode() + " " + entity.getLocation().getCountry());
		 }

		 transaction.commit();
		 
		 
		 session.close();
		 
		 

	}

}



