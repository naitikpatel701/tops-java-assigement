package Employees;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext cx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee employee=cx.getBean("regular",Employee.class);
		employee.empdetalis();
		
		Employee employee1=cx.getBean("contract",Employee.class);
		employee1.empdetalis();
	}

}
