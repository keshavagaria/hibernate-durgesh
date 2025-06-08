package com.hcl.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	/*
	    	Question question1=new Question();
	    	question1.setQuestionId(103);
	    	question1.setQuestion("What is JDBC");
	    	
	    	Answer answer1=new Answer();
	    	answer1.setId(203);
	    	answer1.setAnswer("JDBC stands for JAVA DATABASE CONNECTIVITY");
	    	
	    	question1.setAnswer(answer1);
	    	
	    	
	    	
	    	Question question2=new Question();
	    	question2.setQuestionId(102);
	    	question2.setQuestion("What is Collection Framework");
	    	
	    	Answer answer2=new Answer();
	    	answer2.setId(202);
	    	answer2.setAnswer("API to work with Objects");
	    	
	    	question2.setAnswer(answer2);
	    
	    */	
	    	
	    	
	    	
    	   SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
           Session session=   sessionFactory.openSession();
           Transaction tx=  session.beginTransaction();
           
           //session.save(question1);
          // session.save(answer1);
//           session.save(question2);
//           session.save(answer2);
           Question q=null;
           q=session.load(Question.class, 101);
           System.out.println(q.getQuestionId()+" "+q.getQuestion());
          
           tx.commit();
           session.close();
           //System.out.println(q.getAnswer());
    }
}
