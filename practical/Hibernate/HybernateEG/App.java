package com.Ashoke1.HybernateEG;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
  
	public static void main( String[] args )
    {
        SessionFactory s=new Configuration().configure().buildSessionFactory();
        Session ses =s.openSession();
        Transaction t=ses.beginTransaction();
        Employee e=new Employee();
       
        e.setFirstname("Raja");
        e.setLastname("Malakar");
        e.setEmail("Raja@gmail.com");
        e.setMobile("96471449");
        ses.save(e);
        t.commit();
        System.out.println("data inserted successfully. Thank You!");
        s.close();
        ses.close();
    }
}
