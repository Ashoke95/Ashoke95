package com.Ashoke1.OneToOneBIDirectional;

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
	     e.setName("Ashoke");
	     Employee e1=new Employee();
	     e1.setName("Romen");
	     
	     Address a=new Address();
	     a.setHouseno("A-102");
	     a.setCity("Medinipur");
	     a.setState("West Bengal");
	     a.setCountry("India");
	     a.setPincode(721136);

	     Address a1=new Address();
	     a1.setHouseno("A-109");
	     a1.setCity("Kolkata");
	     a1.setState("up");
	     a1.setCountry("India");
	     a1.setPincode(752178);
	     
	     e.setAddress(a);
	     e1.setAddress(a1);
	     a.setEmployee(e);
	     a1.setEmployee(e1);
	     ses.save(e);
	     ses.save(e1);
	     t.commit();
	     ses.close();
	     System.out.println("data added successfully, Thank You!");
	     
	     
	     
	     
	     
    }
}
