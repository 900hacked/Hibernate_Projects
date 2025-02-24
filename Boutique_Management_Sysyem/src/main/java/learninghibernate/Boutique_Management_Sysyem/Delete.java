package learninghibernate.Boutique_Management_Sysyem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Delete {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Bot entity = session.get(Bot.class, 80);
		if (entity != null) { 
		entity.setCategory("Feet");
		session.delete(entity);
		transaction.commit();

	}

	}

}
