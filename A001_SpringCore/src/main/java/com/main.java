package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student st=cx.getBean("std",Student.class);
		st.display();
	
	}
}
