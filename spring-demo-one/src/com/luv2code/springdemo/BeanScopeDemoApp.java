package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//Load the Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// Retrieve Bean from Spring container
		Coach theCoach  = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if these beans are same 
		boolean result = (theCoach == alphaCoach);
		// Print Result 
		System.out.println("Pointing the same object? : "+result);
		
		System.out.println("Memory location of theCoach: "+theCoach);
		
		System.out.println("Memory location of theCoach: "+alphaCoach);
		
		//Close Context		
		context.close();

	}

}
