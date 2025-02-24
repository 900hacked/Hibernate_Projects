package learninghibernate.Boutique_Management_Sysyem;

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
		
		List<Bot> entities = session.createQuery("from Bot",Bot.class).list();
		 
		 for (Bot entity : entities) {
		 System.out.println(entity.getName() + " " + entity.getCategory() + " " + entity.getPrice() + " " + entity.getStockQuantity());
		 }

		 transaction.commit();
		 
		 session.close();
	}

}
