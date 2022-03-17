package com.Ashoke1.HibernateEg1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {
	
	public static void main(String a[])
	{
		 SessionFactory s=new Configuration().configure().buildSessionFactory();
	        Session ses =s.openSession();
	        Transaction t=ses.beginTransaction();
	        Student st=ses.get(Student.class,2);
	        st.setStudentname("priya");
	        System.out.println("record updated succesfully");
	        ses.getTransaction().commit();
	        s.close();
	}

}
