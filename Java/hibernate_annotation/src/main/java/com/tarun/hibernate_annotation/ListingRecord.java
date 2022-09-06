package com.tarun.hibernate_annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.*;

public class ListingRecord {
	
	 public static void main(String[] args) {
	        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	        Session session=sessionFactory.openSession();
	        
	        System.out.println("Update Record");
	        Transaction tx = session.beginTransaction();
	        System.out.println("==========================");
	        Author updatingAuthor = session.get(Author.class, 1);
	        updatingAuthor.setBookPublished(false);
	        updatingAuthor.setDateOfPublication(new Date());
	        
	       
	        
	        Author a= session.get(Author.class, 1);
	        System.out.println(a);
	        System.out.println("==========================");
	        List<Author> allAuthor = session.createQuery("FROM Author").list();
	        for (Author author : allAuthor) {
	        	System.out.println(author);
	        }
	        System.out.println("Record has been retrived successfully");
	        session.close();
	        sessionFactory.close();
	    }

}
