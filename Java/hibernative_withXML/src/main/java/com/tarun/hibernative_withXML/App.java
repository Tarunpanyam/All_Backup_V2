package com.tarun.hibernative_withXML;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tarun.hibernative_withXML.model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Book book = new Book();
        book.setIsbn(45347);
        book.setTitle("Python");
        
        session.save(book);
        //session.persist(book);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
    
}
