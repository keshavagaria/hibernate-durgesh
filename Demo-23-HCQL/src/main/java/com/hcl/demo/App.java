package com.hcl.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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
    	
    	 //HCQL-RETRIEVE-HCQL to get all the records
//    	 Criteria criteria= session.createCriteria(Home.class);   
//    	 List<Home> homes=criteria.list();
//    	 for(Home h:homes) {
//    		 System.out.println(h);
//    	 }
//    	 
    	 
    	 //HCQL to get the 10th to 20th record
//    	 Criteria criteria= session.createCriteria(Home.class);   
//    	 criteria.setFirstResult(0);
//    	 criteria.setMaxResults(2);
//    	 
//    	 List<Home> homes=criteria.list();
//    	 for(Home h:homes) {
//    		 System.out.println(h);
//    	 }
//    	 
    	 
    	 //HCQL to get the records whose price is greater than 100000
//    	 Criteria criteria= session.createCriteria(Home.class);   
//    	 criteria.add(Restrictions.gt("price", 100000));
//    	 List<Home> homes=criteria.list();
//    	 for(Home h:homes) {
//    		 System.out.println(h);
//    	 }
    	 
    	 //HCQL to get the records in ascending order on the basis of salary
//    	 Criteria criteria= session.createCriteria(Home.class);   
//    	 criteria.addOrder(Order.desc("price"));
//    	 List<Home> homes=criteria.list();
//    	 for(Home h:homes) {
//    		 System.out.println(h);
//    	 }
    	 
    	// HCQL with Projection
    	 Criteria criteria= session.createCriteria(Home.class);   
    	 //criteria.setProjection(Projections.property("id"));
    	 
    	// criteria.setProjection(Projections.sum("price"));
    	 //criteria.setProjection(Projections.count("price"));
    	 //criteria.setProjection(Projections.min("price"));
    	 //criteria.setProjection(Projections.max("price"));
    	 criteria.setProjection(Projections.avg("price"));
    	 
    	 List<Double> homes=criteria.list();
    	 for(Double h:homes) {
    		 System.out.println(h);
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
