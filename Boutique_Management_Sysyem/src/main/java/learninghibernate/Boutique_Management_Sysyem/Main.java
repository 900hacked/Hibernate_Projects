package learninghibernate.Boutique_Management_Sysyem;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		HashSet <Bot> boutique = new HashSet<Bot>();
		
//		boutique.add(new Bot("Jordan 1s","Shoes",100.00,6));
//		boutique.add(new Bot("Blue sport sweatpants","Bottom wear",40.50,30));
		
		Bot bot =new Bot();
		
		bot.setName("Jordan 1s");
		bot.setCategory("Shoes");
		bot.setPrice(100);
		bot.setStockQuantity(25);
		
		
		session.save(bot);
		 
        // Commit transaction
        transaction.commit();
 
        // Close the session
        session.close();
		

	}

}
