package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//Call methods of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new method fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
         context.close();
	}

}
