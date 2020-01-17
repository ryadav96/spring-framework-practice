package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CricketCoachDemo {

	public static void main(String[] args) {
		// load config spring container
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(CricketConfig.class);	
		//get the bean 
		Coach theCoach = context.getBean("cricketCoach",Coach.class);
		//use bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//close context
		context.close();

	}

}
