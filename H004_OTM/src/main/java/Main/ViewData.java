package Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class ViewData {
	public static void main(String[] args) {
		
		
		SessionFactory sf=new  Configuration()
				          .configure("hibernate.cfg.xml")
				          .addAnnotatedClass(Product.class)
				          .addAnnotatedClass(Category.class)
				          .buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		List<Product> p = s.createQuery("from Product").list();
		for(Product c : p)
		{
			System.out.println(c.getId()+" "+c.getName()+" "+c.getCategory().getName());
		}
		tx.commit();
	}

}
