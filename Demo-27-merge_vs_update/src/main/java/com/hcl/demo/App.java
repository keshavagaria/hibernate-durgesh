package com.hcl.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//        Cooler cooler=new Cooler();
//        cooler.setCoolerId(101);
//        cooler.setCoolerName("Cooler 1");
        
    	 SessionFactory factory=new Configuration().configure().buildSessionFactory();
    	 Session session=factory.openSession();
        
        
        //session.save(cooler);
        Cooler c=session.get(Cooler.class, 101);
        System.out.println(c);
        
        session.close();
        
        c.setCoolerName("Cooler 3");
        
       Session session2= factory.openSession();
       Transaction tx=  session2.beginTransaction();
       Cooler c2=session2.get(Cooler.class, 101);
       System.out.println(c2);
       //session2.update(c);
       session2.merge(c);
       tx.commit();
       session2.close();
        
    }
}
