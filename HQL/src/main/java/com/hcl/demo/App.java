package com.hcl.demo;



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
    	
    	 //HQL-RETRIEVE
    	// Query query=(Query) session.createQuery("from animals");
    	// Query query=(Query) session.createQuery("from animals where name='Lion'");
//    	 Query query=(Query) session.createQuery("from animals where name=:n");
//    	 query.setParameter("n", "TIGER");
//    	 List<Animal> animals=query.list();
//    	 
//    	 for(Animal a:animals) {
//    		 System.out.println(a.getName()+" "+a.getColor());
//    	 }
    	 
    	//HQL-UPDATE
//    	 Query query=(Query) session.createQuery("update animals set color=:c,name=:n where id=:i");
//    	 query.setParameter("c", "Pink");
//    	 query.setParameter("n", "Butterfly");
//    	 query.setParameter("i", 4);
//    	 
//    	 int status=query.executeUpdate();
//    	 System.out.println(status);
    	 
    	//HQL-DELETE
    	 Query query=session.createQuery("delete from animals where id=:i");
    	 query.setParameter("i", 4);
    	 int status=query.executeUpdate();
    	 System.out.println("Deleted Successfully with status="+status);
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
