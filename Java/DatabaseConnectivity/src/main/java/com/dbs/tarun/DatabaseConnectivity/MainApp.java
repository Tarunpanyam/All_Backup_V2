package com.dbs.tarun.DatabaseConnectivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import java.lang.module.Configuration;

import com.dbs.tarun.DatabaseConnectivity.model.Employee;
import com.dbs.tarun.DatabaseConnectivity.model.Person;
//import com.mysql.cj.Session;
//import com.mysql.cj.xdevapi.SessionFactory;

//import jakarta.transaction.Transaction;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // TODO Auto-generated method stub
        System.out.println("Hi i am going to Learn Hibernate ORM tool");
        SessionFactory sessionFactory= new Configuration().configure("NewFile.xml").buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Person p= new Person();
        p.setPersonId(3);
        p.setPersonName("Dr Tarkeshwar Barua");
        p.setPersonCity("Hydrabad");
        
        Employee e=new Employee();
        e.setEmpId(1);
        e.setEmpName("Mr. XYX");
        
        session.save(p);
        session.save(e);
        transaction.commit();
        session.close();
        sessionFactory.close();
        
    }

	}
