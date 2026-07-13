package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Blog;
import model.User;

public class UserDao {

	SessionFactory sessionFactory=null;
	public   UserDao() {
	sessionFactory=	new Configuration()
                    .configure()
                    .addAnnotatedClass(User.class)
                    .addAnnotatedClass(Blog.class)
                    .buildSessionFactory();
	}

		 public int register(User u) {
		        Transaction tx = null;
		        
		        try {
		        	Session session = sessionFactory.openSession();
		            tx = session.beginTransaction();
		            session.persist(u);
		            tx.commit();
		            return 1;
		            
		        } catch (Exception e) {
		      
		            e.printStackTrace();
		            return 0;
		        }
		    }

		    public User login(String email, String passWord) {
		        try {
		        	Session session = sessionFactory.openSession();
		        	Transaction tx=session.beginTransaction();
		            String hql = "from User u where u.email = :email and u.passWord = :passWord";
		            return session.createQuery(hql, User.class)
		                    .setParameter("email", email)
		                    .setParameter("passWord", passWord)
		                    .uniqueResult();
		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		    }
}
