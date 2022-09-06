package com.tarun.hibernate_annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class MainApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Author a = new Author();
        a.setAuthorName("Harshith");
        session.save(a);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
