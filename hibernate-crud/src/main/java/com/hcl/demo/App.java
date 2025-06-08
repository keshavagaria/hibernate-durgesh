package com.hcl.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
          SessionFactory sessionFactory=null;
          Session session=null;
          Transaction transaction=null;
          
          try {
        	  			sessionFactory=new Configuration().configure().buildSessionFactory();
        	  			session=sessionFactory.openSession();
        	  			transaction=session.beginTransaction();
          
			          //CREATE
//			          for(int i=1;i<=10;i++)
//			          {
//			        	  Bicycle bicycle=new Bicycle();
//			        	  bicycle.setName("Cycle "+i);
//			        	  session.save(bicycle);
//			          }
			          
			          //RETRIEVE
//        	  		Bicycle bicycle=	session.get(Bicycle.class, 10);
//        	  		System.out.println("The pulled cycle is "+bicycle.getName());
        	  		
        	  		
        	  		//UPDATE
//        	  		Bicycle bicycle=	session.get(Bicycle.class, 10);
//        	  		bicycle.setName("UPDATED CYCLE 10");
//        	  		session.update(bicycle);
			         
        	  		//DELETE
        	  		Bicycle bicycle=	session.get(Bicycle.class, 1);
        	  		session.delete(bicycle);
        	  		
        	  		transaction.commit();
          
          		}catch (Exception e) {
          				e.printStackTrace();
          				transaction.rollback();
          	}
          finally {
        	  session.close();
          }
    }
}
