package com.hcl.demo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
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
    	
    	 
    	//SQL-CREATE
    	 Query query=session.createSQLQuery("insert into Janvar(id,name,color) values (:i,:n,:c)");
    	 query.setParameter("i", 5);
    	 query.setParameter("n", "Whale");
    	 query.setParameter("c", "Blue");
    	 int resultInserted=query.executeUpdate();
    	 System.out.println("Deleted Successfully with result="+resultInserted);
    	 
    	 
    	 //RETRIEVE
//    	 Query query=session.createSQLQuery("select * from Janvar");
//    	 
//    	 List<Object []> list=query.list();
//    	 for(Object[] a:list) {
//    		 System.out.println(Arrays.toString(a));
//    	 }
    	 
    	//SQL-UPDATE
//    	 Query query=(Query) session.createSQLQuery("update Janvar set color=:c,name=:n where id>:i");
//    	 query.setParameter("c", "Red");
//    	 query.setParameter("n", "Ant");
//    	 query.setParameter("i", 3);
//    	 
//    	 int resultUpdated=query.executeUpdate();
//    	 System.out.println(resultUpdated);
    	 
    	//SQL-DELETE
//    	 Query query=session.createSQLQuery("delete from Janvar where id>:i");
//    	 query.setParameter("i", 3);
//    	 int resultDeleted=query.executeUpdate();
//    	 System.out.println("Deleted Successfully with result="+resultDeleted);
//    	 
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
