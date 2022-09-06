package com.tarun.springcore.lifecycle.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
        ConfigurableApplicationContext applicationContext2 = (ConfigurableApplicationContext)applicationContext;
        
        Object personObject1 =applicationContext.getBean("logger_class");
        System.out.println(personObject1);
        
        applicationContext2.registerShutdownHook();
        System.out.println("Ioc container has been shutdown");
    }
}
