package com.Ashoke1.ManyToOneRelationUniDirectional;

import java.util.ArrayList;

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
	     Transaction t=ses.beginTransaction() ;
	     Employee e=new Employee();
	     e.setEmpname("Ashoke");
	     e.setEmpdesig("developer");
	     e.setEmpaddress("kolkkata");
	     e.setEmpemail("ashoke@gmail.com");
	     
	     
	     
	     Employee e1=new Employee();
	     e1.setEmpname("Lija");
	     e1.setEmpdesig("developer");
	     e1.setEmpaddress("pune");
	     e1.setEmpemail("lija@gmail.com");
	     
	     
	     
	     
	     
	     Employee e2=new Employee();
	     e2.setEmpname("Riya");
	     e2.setEmpdesig("Admin");
	     e2.setEmpaddress("mumbi");
	     e2.setEmpemail("riya@gmail.com");
	     
	     
	     Company cmp =new Company();
	     cmp.setCmpname("capgimini");
	    
	    Company cmp1 =new Company();
	    cmp1.setCmpname("Cognigent");
	    
	    e.setCompany(cmp);
	    e1.setCompany(cmp);
	    e2.setCompany(cmp);
	    ses.save(cmp);
	    ses.save(e);
	    ses.save(e1);
	    ses.save(e2);
	     
	     
	     
	     
	    ses.getTransaction().commit();
        ses.close();  
	     
	 
	    System.out.println("data added successfully,Thank You");
	    
	     
	     
    }
}
