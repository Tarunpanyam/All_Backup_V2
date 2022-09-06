package com.dbs.tarun.one2one_bidirectional;

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
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
      //==========================================================
        Mobile mobilePhone = new Mobile();
        mobilePhone.setOs("Windows");
        
        Charger charger=new Charger();
        charger.setAmp("5.4");
        
        charger.setMobile(mobilePhone);
        
        session.save(charger);
        session.save(mobilePhone);
        //=============================================================
        Charger charger1=new Charger();
        charger1.setAmp("14.4");
        
        Mobile mobilePhone1=new Mobile();
        mobilePhone1.setOs("Apple");
        mobilePhone1.setCharger(charger1);
        
        session.persist(charger1);
        session.persist(mobilePhone1);
        transaction.commit();
        session.close();
    }
}
