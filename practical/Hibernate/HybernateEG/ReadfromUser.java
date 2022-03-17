package com.Ashoke1.HybernateEG;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadfromUser {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int n=sc.nextInt();
		 SessionFactory s=new Configuration().configure().buildSessionFactory();
	        Session ses =s.openSession();
	        Transaction t=ses.beginTransaction();
	        Employee e=ses.get(Employee.class,n);
	        ses.close();
	        s.close();
	       
	     System.out.println(" id is: "+e.getId()+" \n "+" sFrist Name is :"+e.getFirstname()+"\n "+"Last Name is :"+e.getLastsname()+" \n"+"Email is : "+e.getEmail()+" \n "+"Mobile: "+e.getMobile()) ;  

}
}