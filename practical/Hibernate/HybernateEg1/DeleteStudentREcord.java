package com.Ashoke1.HibernateEg1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudentREcord {

	public static void main(String[] args) {
		 SessionFactory s=new Configuration().configure().buildSessionFactory();
	        Session ses =s.openSession();
	        Transaction t=ses.beginTransaction();
	        Student st=ses.load(Student.class,2);
	        ses.delete(st);
	        System.out.println("record deleted successfully");
	        ses.getTransaction().commit();
	        s.close();

	}

}
