package com.hcl.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 class App 
{
    public static void main( String[] args )
    {
    	
    	Vehicle vehicle=new Vehicle();
    	vehicle.setVehicleName("Truck");
    	
    	
    	TwoWheelerVehicle twoWheelerVehicle=new TwoWheelerVehicle();
    	twoWheelerVehicle.setVehicleName("Bullet");
    	twoWheelerVehicle.setSteeringHandle("Bullet Handle");

    	FourWheelerVehicle fourWheelerVehicle=new FourWheelerVehicle();
    	fourWheelerVehicle.setVehicleName("Audi");
    	fourWheelerVehicle.setSteeringWheel("Audi WHeel");
    	
       SessionFactory factory=   new Configuration().configure().buildSessionFactory();
       Session session=	factory.openSession();
       Transaction t=	session.beginTransaction();
        
        int id=(Integer) session.save(vehicle);
        int id2=(Integer) session.save(twoWheelerVehicle);
        int id3=(Integer) session.save(fourWheelerVehicle);
        System.out.println(id+" "+id2+" "+id3);
        
        
        t.commit();
        session.close();
    }
}
