package com.tarun.hibernate_annotation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.protobuf.Duration;

public class AddRecord {
	 public static void main(String[] args) {
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
    Session session=sessionFactory.openSession();
    Transaction transaction =session.beginTransaction();
    
    Author a=new Author();
    a.setBookPublished(false);
    a.setDateOfPublication(new Date());
    a.setBookPublished(false);
    a.setAuthorName("Dr. Tarkeshwar Barua");
    a.setDateOfPublication(new Date());
    a.setDaterelease(LocalDate.now());
    a.setDaterelease1(LocalDateTime.now());
    //a.setContractValidity(Duration.ofDays(2));
    a.setDateOfContract(Calendar.getInstance(TimeZone.getTimeZone("IST")));
    a.setGender(Gender.Male);
    
    Laptop laptop =new Laptop();
    laptop.setCpu("i7");
    laptop.setRam("16GB");
    laptop.setBrand("Aspire");
    
    a.setLaptop(laptop);
    
    session.persist(laptop);
    session.persist(a);
    transaction.commit();
    session.close();
    sessionFactory.close();
	 }
}
