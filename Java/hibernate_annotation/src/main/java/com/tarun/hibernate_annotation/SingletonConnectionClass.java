package com.tarun.hibernate_annotation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Singleton class is used to create only single object per JVM
//Session factory is very expensive object and it is thread safe object, 
//it can reside in the JVM for long without effecting negatively 
public class SingletonConnectionClass {
 private SingletonConnectionClass() {
 } // private constructor don't allow anybody to create object from outside
 private static SessionFactory sessionFactory = null;
 public static synchronized SessionFactory getconnection() {
     // synchronized don't allow another copy even in the multi-threaded environment
     if (sessionFactory == null) {
         sessionFactory = new Configuration().configure().buildSessionFactory();
         return sessionFactory;
     }
     return sessionFactory;
 } 
 // This approach is known as best practice
 public static synchronized Session getconnectionSession() {
     // synchronized don't allow another copy even in the multi-threaded environment
     if (sessionFactory == null) {
    	 sessionFactory = new Configuration().configure().buildSessionFactory();
         return sessionFactory.openSession();
     }
     return sessionFactory.openSession();
 }
// public class App 
// {
//     public static void main( String[] args )
//     {       
//         Session session=SingletonConnectionClass.getconnectionSession();
//         Laptop laptop=session.get(Laptop.class,1l);
//         System.out.println(laptop);
//         session.close();
//     }
// }