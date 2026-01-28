package Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Capital;
import model.Country;

public class ViewData {
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
		
//      Country c=s.find(Country.class, 1);
//      System.out.println(c.getId()+" "+c.getName()+" "+c.getCapital().getName());
		
		List<Country> c=s.createQuery("from Country").list();
		
		for(Country c1 : c) {
			
			 System.out.println(c1.getId()+" "+c1.getName()+" "+c1.getCapital().getName());
		}
      
        
				
		tx.commit();
	}

}
