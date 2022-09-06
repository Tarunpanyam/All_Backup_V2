package com.tarun.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("NewFile.xml");
        Object personObject =applicationContext.getBean("emp");
        System.out.println(personObject);
        
        Object personObject1 =applicationContext.getBean("logger_class");
        System.out.println(personObject1);
        
        Object personObject2 =applicationContext.getBean("logger_class1");
        System.out.println(personObject2);
        
        Object personObject3 =applicationContext.getBean("logger_class2");
        System.out.println(personObject3);
        
        Object personObject4 =applicationContext.getBean("logger_class3");
        System.out.println(personObject4);
    }
}
