package com.Ashoke1.HibernateEg1;

import java.util.Iterator;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

public class ReadStudent {
	public static void main(String a[])
	{

   	 SessionFactory s=new Configuration().configure().buildSessionFactory();
        Session ses =s.openSession();
        Transaction t=ses.beginTransaction();
        
        Query query= ses.createQuery("from Student");
        java.util.List students=((org.hibernate.query.Query) query).list();
        
        for(Iterator iterator=students.iterator();iterator.hasNext();)
        {
        	Student st=(Student) iterator.next();
        	System.out.print(" id is "+st.getId());
        	System.out.print(" name  is "+st.getStudentname());
        	System.out.print(" course is "+st.getCourse());
        	System.out.print(" email is  "+st.getEmail());
        	System.out.print(" phone is "+st.getPhone());
        	System.out.println(" Fees is  "+st.getFees());
        	
        }
	}

}
