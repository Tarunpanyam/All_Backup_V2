import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;
import model.Laptop;

public class AssociationInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspringconfiguration.xml");

Employee empObj =(Employee) applicationContext.getBean("empaliase");
System.out.println(empObj);

Laptop lapObj=(Laptop) applicationContext.getBean("Lap");
System.out.println(lapObj);

	}

}
