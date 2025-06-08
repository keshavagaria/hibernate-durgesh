package com.hcl.demo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory=null;;
    	Session session=null;
    	Transaction t=null;
    	try {
    	 sessionFactory=new Configuration().configure().buildSessionFactory();
    	 session= sessionFactory.openSession();
    	 t=session.beginTransaction();
    	
    	 Query query=session.createQuery("SELECT Question.questionId,Answer.id FROM Question"
    			+ " INNER JOIN Answer ON Question.answer=Answer.id");
    	 
    	 List<Object []> list=query.list();
    	 for(Object[] a:list) {
    		 System.out.println(Arrays.toString(a));
    	 }
    	 t.commit();
    	 
    	}catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			
		}
    	finally {
			session.close();
		}
    	
    	
    }
}
