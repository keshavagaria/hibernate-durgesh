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
         User_Details user=null;
         
         			//TRANSIENT STATE
			         User_Details details=new User_Details();
			         details.setUserName("Tom");
			       
         
       
       	  			sessionFactory=new Configuration().configure().buildSessionFactory();
       	  			session=sessionFactory.openSession();
//       	  			transaction=session.beginTransaction();
//         
//       	  			//PERSISTENT STATE   ----> session,database
//			        session.save(details);
//			       
//			        details.setUserName("Cameron");
//			        details.setUserName("Penelope");
//			 
//       	  		transaction.commit();
       	  			
       	  		user=session.get(User_Details.class, 6);
       	  		System.out.println(user.getUserName());
         
         	
        
       	  session.close();
      
         	//DETACHED STATE
         	user.setUserName("Amber Heard");
         	
      	  
      	  
         	//Detached ---> Persistent
         	session=sessionFactory.openSession();
         	transaction=session.beginTransaction();
         	session.update(user);
        	//user.setUserName("Johnny");
         	transaction.commit();
         	session.close();
         	
    }
}
