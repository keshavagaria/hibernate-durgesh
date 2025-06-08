package com.hcl.demo;


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
        SessionFactory factory=null;
        Session session=null;
        Transaction tx=null;
        
        try {
	        factory=new Configuration().configure().buildSessionFactory();
	        session=factory.openSession();
	        tx=session.beginTransaction();
	        
	        Query q1=(Query) session.createQuery("select min(id) from animals");
	        Query q2=(Query) session.createQuery("select max(id) from animals");
	        Query q3=(Query) session.createQuery("select sum(id) from animals");
	        Query q4=(Query) session.createQuery("select avg(id) from animals");
	        Query q5=(Query) session.createQuery("select count(id) from animals");
	        List<Long> list1=q1.list();
	        List<Long> list2=q2.list();
	        List<Long> list3=q3.list();
	        List<Long> list4=q4.list();
	        List<Long> list5=q5.list();
	        System.out.println("min(id)"+list1);
	        System.out.println("max(id)"+list2);
	        System.out.println("sum(id)"+list3);
	        System.out.println("avg(id)"+list4);
	        System.out.println("count(id)"+list5);
	        
	        tx.commit();
        }catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
        finally {
			session.close();
		}
        
    }
}
