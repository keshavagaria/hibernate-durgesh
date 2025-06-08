package com.hcl.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	Address address=new Address();
    	address.setStreet("street 123");
    	address.setCity("MUMBAI");
    	address.setOpen(true);
    	address.setAddedDate(new Date());
    	address.setX(1234.2354);
    	
    	
    	//Reading Image
    	FileInputStream fis=new FileInputStream("src/main/java/photo.jpg");
    	byte[] data=new byte[fis.available()];
    	fis.read(data);
    	address.setImage(data);
    	
    	
    	SessionFactory sessionFactory=new  Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(address);
        session.getTransaction().commit();
        session.close();
    }
}
