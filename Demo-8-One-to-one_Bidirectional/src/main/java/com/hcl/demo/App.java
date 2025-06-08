package com.hcl.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	/*Question2 question2_1=new Question2();
    	question2_1.setQuestionId(101);
    	question2_1.setQuestion("What is Java");
    	
    	Answer2 answer2_1=new Answer2();
    	answer2_1.setId(201);
    	answer2_1.setAnswer("Java is a Programming Language");
    	
    	question2_1.setAnswer2(answer2_1);
    	answer2_1.setQuestion2(question2_1);
    	
    	
    	
    	Question2 question2_2=new Question2();
    	question2_2.setQuestionId(102);
    	question2_2.setQuestion("What is Collection Framework");
    	
    	Answer2 answer2_2=new Answer2();
    	answer2_2.setId(202);
    	answer2_2.setAnswer("API to work with Objects");
    	
    	question2_2.setAnswer2(answer2_2);
    	answer2_2.setQuestion2(question2_2);
    	*/
    	
    	
    	
    	
	   SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
       Session session=   sessionFactory.openSession();
       Transaction tx=  session.beginTransaction();
       
//       session.save(question2_1);
//       session.save(question2_2);
//       session.save(answer2_1);
//       session.save(answer2_2);
       Question2 q2=null;
       q2=session.load(Question2.class, 101);
       System.out.println(q2.getQuestionId()+" "+q2.getQuestion());
      // System.out.println(q2.getAnswer2());
       tx.commit();
       session.close();
       //System.out.println(q2.getAnswer2().getAnswer());
    }
}
