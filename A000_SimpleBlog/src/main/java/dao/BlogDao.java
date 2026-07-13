package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Blog;
import model.User;

public class BlogDao {

	SessionFactory sessionFactory = null;

	public BlogDao() {
		// TODO Auto-generated constructor stub
		sessionFactory = new Configuration()
				       .configure()
				       .addAnnotatedClass(User.class)
				       .addAnnotatedClass(Blog.class)
				       .buildSessionFactory();
	}

	public int addBlog(Blog b) {
		int i =0;
		try {
			Session s=sessionFactory.openSession();
			Transaction tx=s.beginTransaction();
			s.persist(b);
			tx.commit();
			i=1;
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<Blog> getAllBlogs() {
		
		ArrayList<Blog> al=null;
		
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			 al = (ArrayList<Blog>) session.createQuery("from Blog", Blog.class).list();
			tx.commit();
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		return al;
	}

	public int deleteBlog(int id) {
		int i=0;
		try {
			Session s=sessionFactory.openSession();
			Transaction tx=s.beginTransaction();
			Blog b=s.find(Blog.class, id);
			s.remove(b);
			tx.commit();
			i=1;
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}