package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main;

public class Main {
	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext  cx=new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		User user=cx.getBean("user",User.class);
		user.display();
	}

}
