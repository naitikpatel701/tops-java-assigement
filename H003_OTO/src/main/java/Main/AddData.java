package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Capital;
import model.Country;

public class AddData {
	public static void main(String[] args) {
		
//		Configuration cfg=new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		cfg.addAnnotatedClass(Country.class);
//		cfg.addAnnotatedClass(Capital.class);
//		SessionFactory sf=cfg.buildSessionFactory();
		
		SessionFactory sf=new  Configuration()
				          .configure("hibernate.cfg.xml")
				          .addAnnotatedClass(Country.class)
				          .addAnnotatedClass(Capital.class)
				          .buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		Country c=new Country();
		c.setId(2);
		c.setName("JAPAN");
		
		Capital c1=new Capital();
		c1.setName("Tokyo");
		c1.setCountry(c);
		
//		s.persist(c);
//		s.persist(c1);
		
		s.merge(c);
		s.merge(c1);
		
		tx.commit();
	}

}
