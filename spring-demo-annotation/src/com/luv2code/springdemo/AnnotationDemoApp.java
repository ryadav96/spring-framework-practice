package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("battingCoach", Coach.class);
		//Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyWorkout());
		
		//Close the context
		context.close();
           
}

}
