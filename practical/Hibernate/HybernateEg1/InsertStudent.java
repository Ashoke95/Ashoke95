package com.Ashoke1.HibernateEg1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent 
{
    public static void main( String[] args )
    {
    	 SessionFactory s=new Configuration().configure().buildSessionFactory();
         Session ses =s.openSession();
         Transaction t=ses.beginTransaction();
         Student st=new Student();
         st.setStudentname("rama");
         st.setPhone(859732489);
         st.setEmail("mina@gmail.com");
         st.setCourse("C++");                              
         st.setFees(10500.50);
         ses.save(st);
         t.commit();
         System.out.println("data inserted successfully. Thank You!");
         s.close();
         ses.close();
    }
}
