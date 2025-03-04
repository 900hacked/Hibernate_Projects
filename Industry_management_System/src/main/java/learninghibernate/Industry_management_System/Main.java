package learninghibernate.Industry_management_System;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Industry ind = new Industry();
		
		ind.setIndustries(new Industries("Steel and Tube","Iron sheets"));
		ind.setLocation(new Location("Nakawa","Kampala","P.O Box 3840","Uganda"));
		
		
		
		session.save(ind);
		 
        // Commit transaction
        transaction.commit();
 
        // Close the session
        session.close();


	}

}
