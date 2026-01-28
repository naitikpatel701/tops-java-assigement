package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Doctor;
import model.Patient;

public class AddData {
	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Doctor.class)
				.addAnnotatedClass(Patient.class)
				.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
//        Doctor d=new Doctor();
//        d.setName("Naitik");
//        
//        Patient p=new Patient();
//        p.setName("XYZ");
//        p.AddDoctor(d);
//        
//        Patient p1=new Patient();
//        p1.setName("ABC");
//        p1.AddDoctor(d);
		
//		Doctor d=new Doctor();
//		d.setName("Aryan");
//		
//		Doctor d1=new Doctor();
//		d.setName("Drshan");
//		
//		Patient p=new Patient();
//		p.setName("Demo");
//		p.AddDoctor(d);
//		p.AddDoctor(d1);
//        
//        s.persist(d);
//        s.persist(d1);
//        s.persist(p);
		
		Doctor d=s.find(Doctor.class, 3);
		d.setName("Aryan");
		s.merge(d);
		
		tx.commit();
	}

}
