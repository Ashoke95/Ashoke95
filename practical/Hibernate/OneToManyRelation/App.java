
///ONE TO MANY  RELATION : UNI DIRECTIONAL

package com.Ashoke1.OneToManyRelation;

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
	     Transaction t=ses.beginTransaction();
	     Question q=new Question();
	     q.setQname("what is html");//question 1
	     Question q1=new Question();
	     q1.setQname("what is java");//question 2
	     
	     Answer a=new Answer();
	     a.setStudentname("ashoke");
	     a.setAnswers("it is .....");
	     
	     Answer a1=new Answer();
	     a1.setStudentname("Ram");
	     a1.setAnswers("it is .....");
	     
	     Answer a2=new Answer();
	     a2.setStudentname("mina");
	     a2.setAnswers("it is .....");
	     
	     Answer a3=new Answer();
	     a3.setStudentname("rina");
	     a3.setAnswers("it is ....java.");
	     
	     Answer a4=new Answer();
	     a4.setStudentname("milan");
	     a4.setAnswers("it is ..... java 1");
	     
	     ArrayList<Answer> arr1=new ArrayList<Answer>();
	     arr1.add(a);
	     arr1.add(a1);
	     arr1.add(a2);
	     ArrayList<Answer> arr2=new ArrayList<Answer>();
	     arr2.add(a3);
	     arr2.add(a4);
	     q.setAnswers(arr1);
	     q1.setAnswers(arr2);
	     ses.save(q);
	     ses.save(q1);
	     t.commit();
	     System.out.println("data added successfully");
	     
	     
	     
    }
}
